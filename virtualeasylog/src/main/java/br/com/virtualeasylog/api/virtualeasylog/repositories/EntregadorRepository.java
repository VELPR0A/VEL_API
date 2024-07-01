package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.Entregador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EntregadorRepository extends JpaRepository<Entregador, String> {

    Optional<Entregador> findById(String id);

    boolean existsById(String idCpf);

    List<Entregador> findAll();

    List<Entregador> findByIdCnpj(String id_cnpj);

    @Query("SELECT CASE WHEN count(e)>0 THEN true ELSE false END FROM Entregador e WHERE e.email = :email AND e.senha = :senha")
    boolean existsByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);

    Entregador findByEmail(String email);

}