package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.Entregador;
import br.com.virtualeasylog.api.virtualeasylog.models.Faturamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FaturamentoRepository extends JpaRepository<Faturamento, Integer> {
    List<Faturamento> findByIdCnpj(String valueOf);

    @Query("SELECT f.entregador.nome FROM Faturamento f WHERE f.idCpf = :idCpf")
    String findNomeByCpf(Long idCpf);
}
