package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlanoRepository extends JpaRepository<Plano, Integer> {
}
