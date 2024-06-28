package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="faturamento")
@Data
@NoArgsConstructor
public class Faturamento {

    @Id
    private int id;

    private Float despesa;

    private Float ganho;

    private LocalDate data;

    @Column(name = "id_cpf")
    private String idCpf;


    @Column(name="cnpj_id")
    private String idCnpj;

}
