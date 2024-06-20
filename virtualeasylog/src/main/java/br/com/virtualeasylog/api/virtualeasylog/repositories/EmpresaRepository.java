package br.com.virtualeasylog.api.virtualeasylog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.virtualeasylog.api.virtualeasylog.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Query(value = "SELECT e FROM Empresa e WHERE e.email = :email AND e.senha = :senha")
    Empresa existsByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);

    boolean existsByIdCnpj(String idCnpj);
}
