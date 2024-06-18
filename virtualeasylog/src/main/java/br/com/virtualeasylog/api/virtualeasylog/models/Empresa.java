package br.com.virtualeasylog.api.virtualeasylog.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="empresa")
@Data
@NoArgsConstructor
public class Empresa {

    @Id
    @Column (name = "id_cnpj")
    private String idCnpj;

    private String email;
    private String endereco;
    private String telefone;
    private String proprietario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_plano")
    private Plano plano;


    @Column (name = "id_faturamento")
    private Integer idFaturamento;

    @Column (name = "id_cpf_coord")
    private Integer idCpfCoord;

    @Column (name = "id_cpf")
    private String idCpf;

    @Column (name = "id_contrato")
    private Integer idContrato;

    @Column
    private String senha;

}