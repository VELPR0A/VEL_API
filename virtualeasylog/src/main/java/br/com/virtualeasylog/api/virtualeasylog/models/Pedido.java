package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pedido")
@Data
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String telefone;

    private  String endereco;

    private  String descricao;

    private Integer valor;

    private Integer formaPagamento;

    private Integer idUsuario;

    @Column (name="id_cpf")
    private  String idCpf;







}

