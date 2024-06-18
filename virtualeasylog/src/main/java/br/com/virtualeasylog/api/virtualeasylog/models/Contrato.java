package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="contrato")
@Data
@NoArgsConstructor
public class Contrato {
    @Id
    @Column
    private int id;

    @Column (name = "caminho_contrato")
    private String caminhoContrato;

    @Column (name="data_criacao")
    private Date dataCriacao;



}
