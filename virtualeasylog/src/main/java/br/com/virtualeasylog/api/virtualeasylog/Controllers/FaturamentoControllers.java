package br.com.virtualeasylog.api.virtualeasylog.Controllers;

import br.com.virtualeasylog.api.virtualeasylog.models.Faturamento;
import br.com.virtualeasylog.api.virtualeasylog.repositories.EntregadorRepository;
import br.com.virtualeasylog.api.virtualeasylog.repositories.FaturamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/faturamento")
@RestController
public class FaturamentoControllers {

    @Autowired
    private FaturamentoRepository faturamentoRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Faturamento> listar(){
        return faturamentoRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/id{id}")
    public Optional<Faturamento> listarPorId(@PathVariable Integer id){
        return faturamentoRepository.findById(id);
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Faturamento adicionar(@RequestBody Faturamento faturamento){
        return faturamentoRepository.save(faturamento);
    }


    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Faturamento faturamento){
        if (faturamento.getId()>0){
            faturamentoRepository.save(faturamento);
            return "editado com sucesso";
        }
        return "comanda não encontrada";
    }

    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar(@RequestBody Faturamento faturamento){
        if (faturamento.getId()>0){
            faturamentoRepository.delete(faturamento);
            return "removido com sucesso";
        }
        return "comanda não encontrada";
    }

}
