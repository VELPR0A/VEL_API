package br.com.virtualeasylog.api.virtualeasylog.controllers;

import br.com.virtualeasylog.api.virtualeasylog.models.Contrato;
import br.com.virtualeasylog.api.virtualeasylog.repositories.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/contrato")
public class ContratoControllers {

    @Autowired
    private ContratoRepository contratoRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Contrato> listar(){
        List<Contrato> contrato = contratoRepository.findAll();
        return contrato;
    }

    //retorna de um id de contrato especifico
    @CrossOrigin
    @GetMapping("/id/{id}")
    public Optional<Contrato> listarPorId(@PathVariable Integer id){
        Optional<Contrato> contrato = contratoRepository.findById(id);
        return contrato;
    }

    //retorna um contrato com id de uma empresa
    @CrossOrigin
    @GetMapping("/idcnpj/{idcnpj}")
    public Optional<Contrato> listarPorIdContrato (@PathVariable ("idcnpj") String idCnpj){
        Optional<Contrato> contrato = contratoRepository.findByIdCnpj(String.valueOf(idCnpj));
        return contrato;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Contrato adicionar (@RequestBody Contrato contrato){
            return contratoRepository.save(contrato);
    }

    @CrossOrigin
    @PutMapping("/editar")
    public String editar (@RequestBody Contrato contrato){
        if(contrato.getId()>0){
            contratoRepository.save(contrato);
            return "editado com sucesso";
        }
        return "comanda não encontrada";
    }

    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar(@RequestBody Contrato contrato){
        if (contrato.getId()>0){
            contratoRepository.delete(contrato);
            return "removido com sucesso";
        }
        return "comanda não encontrada";
    }




}
