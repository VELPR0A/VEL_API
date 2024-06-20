package br.com.virtualeasylog.api.virtualeasylog.controllers;

import br.com.virtualeasylog.api.virtualeasylog.models.ComandaEntregador;
import br.com.virtualeasylog.api.virtualeasylog.models.Pedido;
import br.com.virtualeasylog.api.virtualeasylog.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class PedidoControllers {

    @Autowired
    private PedidoRepository pedidoRepository;

    @CrossOrigin
    @GetMapping("/")
    public List<Pedido> findallRecord() {
        return pedidoRepository.findAll();
    }

    @CrossOrigin
    @GetMapping("/id/{id}")
    public Optional<Pedido> listarPorId (@PathVariable Integer id){
        return pedidoRepository.findById(id);
    }

    @CrossOrigin
    @PostMapping("/adicionar")
    public Pedido adicionar(@RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    @CrossOrigin
    @PutMapping("/editar")
    public String editar(@RequestBody Pedido pedido){
        if (pedido.getId()>0) {
            pedidoRepository.save(pedido);
            return "editado com sucesso";
        }
        return "comanda não encontrada";
    }

    @CrossOrigin
    @DeleteMapping("/apagar")
    public String deletar(@RequestBody Pedido pedido){
        if (pedido.getId()>0) {
            pedidoRepository.delete(pedido);
            return "removido com sucesso";
        }
        return "comanda não encontrada";
    }
}
