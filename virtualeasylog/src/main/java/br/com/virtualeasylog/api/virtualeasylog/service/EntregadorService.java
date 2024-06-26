package br.com.virtualeasylog.api.virtualeasylog.service;

import br.com.virtualeasylog.api.virtualeasylog.models.ComandaEntregador;
import br.com.virtualeasylog.api.virtualeasylog.models.Entregador;
import br.com.virtualeasylog.api.virtualeasylog.repositories.ComandaEntregadorRepository;
import br.com.virtualeasylog.api.virtualeasylog.repositories.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntregadorService {

    @Autowired
    private EntregadorRepository entregadorRepository;

    @Autowired
    private ComandaEntregadorRepository comandaEntregadorRepository;

    public List<Entregador> getAllEntregadores() {
        return entregadorRepository.findAll();
    }

    public List<ComandaEntregador> getComandasByEntregadorId(String idCpf) {
        return comandaEntregadorRepository.findByEntregadorIdCpf(idCpf);
    }
}
