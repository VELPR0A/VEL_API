package br.com.virtualeasylog.api.virtualeasylog.repositories;

import br.com.virtualeasylog.api.virtualeasylog.models.Coordenador;
import br.com.virtualeasylog.api.virtualeasylog.models.Empresa;
import br.com.virtualeasylog.api.virtualeasylog.models.Faturamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoordenadorRepository extends JpaRepository<Coordenador, String> {
    @Query(value = "SELECT c FROM Coordenador c WHERE c.email = :email AND c.senha = :senha")
    Coordenador existsByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);

    List<Coordenador> findByIdCnpj(String idCnpj);
}
