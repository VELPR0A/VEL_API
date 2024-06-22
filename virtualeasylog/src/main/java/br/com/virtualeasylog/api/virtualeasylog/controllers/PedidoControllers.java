package br.com.virtualeasylog.api.virtualeasylog.controllers;

import br.com.virtualeasylog.api.virtualeasylog.models.ComandaEntregador;
import br.com.virtualeasylog.api.virtualeasylog.models.Pedido;
import br.com.virtualeasylog.api.virtualeasylog.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class PedidoControllers {

    @Autowired
    private PedidoRepository pedidoRepository;

    @CrossOrigin
    @GetMapping("/pedido-semana")
    public List<Pedido> findallRecord() {
        LocalDate dataInicial = LocalDate.now().with(DayOfWeek.MONDAY);
        LocalDate dataFinal = dataInicial.plusDays(6);

        return pedidoRepository.findPedidosDaSemana(dataInicial, dataFinal);
    }

     /*public List<Pedido> findallRecord() {
        return pedidoRepository.findAll();
    }*/

    @CrossOrigin
    @GetMapping("/id/{id}")
    public Optional<Pedido> listarPorId (@PathVariable Integer id){
        return pedidoRepository.findById(id);
    }

    @CrossOrigin
    @PostMapping("/adicionar/{idUsuario}")
    public Pedido adicionar(@RequestBody Pedido pedido, @PathVariable Integer idUsuario) {
        pedido.setIdUsuario(Math.toIntExact(idUsuario));

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
