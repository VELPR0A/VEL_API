package br.com.virtualeasylog.api.virtualeasylog.repositories;


import br.com.virtualeasylog.api.virtualeasylog.models.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Integer> {
        Optional<Contrato> findById(Integer integer);

        List<Contrato> findAll();

        Contrato save(Contrato contrato);

        void delete(Contrato contrato);

        Contrato findByCaminhoContrato(String caminhoContrato);

    Optional<Contrato> findByIdCnpj(String idCnpj);

    Optional<Contrato> findByIdCpf(String idCpf);
}
