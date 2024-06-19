package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pedido")
@Data
@NoArgsConstructor
public class Pedido {

    @Id
    private Integer id;

    private String nome;

    private Integer telefone;

    private  String endereco;

    private  String descricao;

    private Integer valor;

    @Column (name="id_cpf")
    private  String idCpf;






}

