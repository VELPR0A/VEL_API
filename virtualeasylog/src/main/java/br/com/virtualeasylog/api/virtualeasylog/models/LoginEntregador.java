package br.com.virtualeasylog.api.virtualeasylog.models;


import lombok.Data;

// Pegando login e senha da tabela entregador
@Data
public class LoginEntregador {
    private String login;
    private String senha;
}
