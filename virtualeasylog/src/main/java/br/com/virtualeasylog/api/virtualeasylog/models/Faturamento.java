package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="faturamento")
@Data
@NoArgsConstructor
public class Faturamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Float despesa;

    private Float ganho;

    private LocalDate data;

    @Column(name = "id_cpf")
    private String idCpf;


    @Column(name="cnpj_id")
    private String idCnpj;

    @ManyToOne
    @JoinColumn(name = "id_cpf", referencedColumnName = "id_cpf", insertable = false, updatable = false)
    private Entregador entregador;

}
