package br.com.virtualeasylog.api.virtualeasylog.Controllers;

import br.com.virtualeasylog.api.virtualeasylog.models.Comanda;
import br.com.virtualeasylog.api.virtualeasylog.repositories.ComandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/comanda")
public class ComandasControllers {

    //private static final Logger logger = LoggerFactory.getLogger(ComandasControllers.class);

    @Autowired
    private ComandaRepository comandaRepository;

    //url de teste = http://localhost:8084/comanda/
    @CrossOrigin
    @GetMapping("/")
    public List<Comanda> findAllRecords(){
        return comandaRepository.findAll();
    }
   /*public List<Comanda> listar() {
        List<Comanda> comanda = comandaRepository.findAll();
        return comanda;
   }*/

    //url para testar end point: http://localhost:8084/comanda/id/1
    @CrossOrigin
    @GetMapping("/id/{id}")
    public Optional<Comanda> listarPorId(@PathVariable Integer id) {
        Optional<Comanda> comanda = comandaRepository.findById(id);
        return comanda;
    }

    //url para testar end point criação de comanda: http://localhost:8084/comanda/adicionar
    @CrossOrigin
    @PostMapping("/adicionar")
    public Comanda adicionar(@RequestBody Comanda comanda) {
        return comandaRepository.save(comanda);
    }

    //url para testar end point de edição de comanda: http://localhost:8084/comanda/editar
    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Comanda comanda){
        if (comanda.getId()>0) {
            comandaRepository.save(comanda);
            return "editado com sucesso";
        }
        return "comanda não encontrada";
    }

    //url para testar end point de apagar comanda: http://localhost:8084/comanda/apagar
    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar(@RequestBody Comanda comanda){
        if (comanda.getId()>0) {
            comandaRepository.delete(comanda);
            return "removido com sucesso";
        }
        return "comanda não encontrada";
    }


}