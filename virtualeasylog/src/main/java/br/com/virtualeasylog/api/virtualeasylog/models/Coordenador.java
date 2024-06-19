package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="coordenador")
@Data
@NoArgsConstructor
public class Coordenador {

    @Id
    @Column (name = "id_cpf")
    private String idCpf;

    private String NOME;

    private String TELEFONE;

}