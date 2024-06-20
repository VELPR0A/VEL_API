package br.com.virtualeasylog.api.virtualeasylog.controllers;

import br.com.virtualeasylog.api.virtualeasylog.models.Empresa;
import br.com.virtualeasylog.api.virtualeasylog.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping("/empresa")
@RestController
public class EmpresaControllers {

    @Autowired
    private EmpresaRepository empresaRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Empresa> listar() {
        List<Empresa> empresa = empresaRepository.findAll();
        return empresa;
    }


    @CrossOrigin
    @GetMapping("/id/{id}")
    public Optional<Empresa> listarPorId (@PathVariable Integer id){
        Optional<Empresa> empresa =empresaRepository.findById(Long.valueOf(id));
        return empresa;

    }
    @CrossOrigin
    @PostMapping("/adicionar")
    public Empresa adicionar (@RequestBody Empresa empresa){
        return empresaRepository.save(empresa);
    }

    @CrossOrigin
    @PutMapping("/editar")
    public String editar (@RequestBody Empresa empresa){
        if (empresaRepository.existsByIdCnpj(empresa.getIdCnpj())) {
            empresaRepository.save(empresa);
            return "editado com sucesso";
        }
        return "comanda não encontrada";
    }

    @CrossOrigin
    @DeleteMapping("/apagar")
    public  String deletar (@RequestBody Empresa empresa){
        if (empresaRepository.existsByIdCnpj(empresa.getIdCnpj())) {
            empresaRepository.delete(empresa);
            return "apagado com sucesso";
        }
        return "comanda não encontrada";
    }




}