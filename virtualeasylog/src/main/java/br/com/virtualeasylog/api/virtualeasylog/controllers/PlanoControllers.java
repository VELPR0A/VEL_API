package br.com.virtualeasylog.api.virtualeasylog.controllers;

import br.com.virtualeasylog.api.virtualeasylog.models.Plano;
import br.com.virtualeasylog.api.virtualeasylog.repositories.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plano")
public class PlanoControllers {

    @Autowired
    private PlanoRepository planoRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Plano> findAllRecords(){
        return planoRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/id/{id}")
    public Optional<Plano> listarPorId(@PathVariable Integer id){
        Optional<Plano> plano = planoRepository.findById(id);
        return plano;
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Plano adicionar (@RequestBody Plano plano) {
        return planoRepository.save(plano);
    }

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Plano plano){
        if (plano.getId()>0){
            planoRepository.save(plano);
            return "editado com sucesso";
        }
        return "plano não encontrado";
    }

    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar (@RequestBody Plano plano){
        if (plano.getId()>0){
            planoRepository.delete(plano);
            return "plano removido com sucesso";
        }
        return "plano não encontrado";
    }


}
