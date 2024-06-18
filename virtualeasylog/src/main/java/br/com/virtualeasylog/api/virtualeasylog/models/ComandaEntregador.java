package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="comanda_entregador")
@Data
@NoArgsConstructor
public class ComandaEntregador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "endereco_entrega")
    private String enderecoEntrega;

    @Column (name = "informacao_pagamento")
    private String informacaoPagamento;


}
