package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.Faturamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturamentoRepository extends JpaRepository<Faturamento, Integer> {
}
