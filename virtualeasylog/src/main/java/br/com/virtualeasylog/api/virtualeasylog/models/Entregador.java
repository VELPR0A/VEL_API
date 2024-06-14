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
    public String idCpf;

    public String nome;

    public String telefone;

    public String email;

    @Column (name = "conta_bancaria")
    public String contaBancaria;

    public String cnh;



}
