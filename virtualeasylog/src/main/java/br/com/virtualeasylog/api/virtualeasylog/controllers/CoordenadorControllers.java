package br.com.virtualeasylog.api.virtualeasylog.controllers;


import br.com.virtualeasylog.api.virtualeasylog.models.Coordenador;
import br.com.virtualeasylog.api.virtualeasylog.repositories.CoordenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/coordenador")
@RestController
public class CoordenadorControllers{

    @Autowired
    private CoordenadorRepository coordenadorRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Coordenador> findallRecord(){
        return coordenadorRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/id/{id}")
    public Optional<Coordenador> listarPorId (@PathVariable String id){
        return coordenadorRepository.findById(id);
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Coordenador adicionar (@RequestBody Coordenador coordenador){
        return coordenadorRepository.save(coordenador);

    }

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Coordenador coordenador){
        if (coordenadorRepository.existsById(coordenador.getIdCpf())){
            coordenadorRepository.save(coordenador);
            return "editado com sucesso";
        }
        return "comanda não encontrada";
    }


    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar (@RequestBody Coordenador coordenador){
        if (coordenadorRepository.existsById(coordenador.getIdCpf())){
            coordenadorRepository.delete(coordenador);
            return "apagado com sucesso";
        }
        return "comanda não encontrada";
    }


    @CrossOrigin
    @GetMapping("/idcnpj/{idCnpj}")
    public List<Coordenador> findAllByIdCnpj(@PathVariable("idCnpj") String idCnpj) {
        return coordenadorRepository.findByIdCnpj(idCnpj);
    }


}
