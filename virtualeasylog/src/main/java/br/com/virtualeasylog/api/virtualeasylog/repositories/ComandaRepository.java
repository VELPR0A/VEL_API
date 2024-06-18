package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.ComandaEntregador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ComandaRepository extends JpaRepository<ComandaEntregador, Integer> {

    @Override
    Optional<ComandaEntregador> findById(Integer integer);

}


