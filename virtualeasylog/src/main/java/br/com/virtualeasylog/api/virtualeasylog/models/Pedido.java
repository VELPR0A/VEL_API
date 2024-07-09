package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

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

    private LocalDate dataPedido;

    private boolean entregue;

    @Column (name="cpf_id")
    private  String cpfId;


    @Column(name="id_cpf_coord")
    private String idCpfCoord;






}

