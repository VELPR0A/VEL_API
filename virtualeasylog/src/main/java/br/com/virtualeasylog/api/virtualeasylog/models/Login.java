package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Login {
    private String email;
    private String senha;
}
