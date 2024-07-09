package br.com.virtualeasylog.api.virtualeasylog.models;

import br.com.virtualeasylog.api.virtualeasylog.Interfaces.LoginResponsePayLoad;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="coordenador")
@Data
@NoArgsConstructor
public class Coordenador implements LoginResponsePayLoad {

    @Id
    @Column(name = "id_cpf")
    private String idCpf;

    private String NOME;

    private String TELEFONE;

    private String senha;

    private String email;

    @Column(name = "id_cnpj")
    private String idCnpj;


    @Override
    public String getId() {
        return null;
    }


}

