package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="entregador")
@Data
@NoArgsConstructor
public class Entregador {

    @Id
    @Column (name = "id_cpf")
    private String idCpf;

    private String nome;

    private String telefone;

    private String email;

    @Column (name = "conta_bancaria")
    private String contaBancaria;

    private String cnh;

    private Boolean status;




}
