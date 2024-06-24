package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.Entregador;
import br.com.virtualeasylog.api.virtualeasylog.models.Faturamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FaturamentoRepository extends JpaRepository<Faturamento, Integer> {
    List<Faturamento> findByIdCnpj(String valueOf);
}
