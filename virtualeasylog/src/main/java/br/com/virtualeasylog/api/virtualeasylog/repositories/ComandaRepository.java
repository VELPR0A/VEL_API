package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.Comanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ComandaRepository extends JpaRepository<Comanda, Integer> {

    @Override
    Optional<Comanda> findById(Integer integer);

}


