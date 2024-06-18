package br.com.virtualeasylog.api.virtualeasylog.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="plano")
@Data
@NoArgsConstructor
public class Plano {
    @Id
    private Integer id;

    @Column (name = "nome_plano")
    private String nomePlano;

    @OneToMany(mappedBy = "plano", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore

    private List<Empresa> empresas;

}
