package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findAll();

    Optional<Pedido> findById(Integer id);

    Pedido save(Pedido pedido);

    void delete(Pedido pedido);

    @Query("SELECT p FROM Pedido p WHERE p.dataPedido BETWEEN :dataInicial AND :dataFinal AND p.entregue = false")
    List<Pedido> findPedidosDaSemana(@Param("dataInicial") LocalDate dataInicial, @Param("dataFinal") LocalDate dataFinal);
}