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
    public String idCnpj;

    public String email;
    public String endereco;
    public String telefone;
    public String proprietario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_plano")
    public Plano plano;


    @Column (name = "id_faturamento")
    public Integer idFaturamento;

    @Column (name = "id_cpf_coord")
    public Integer idCpfCoord;

    @Column (name = "id_cpf")
    public String idCpf;

    @Column (name = "id_contrato")
    public Integer idContrato;

    @Column
    private String senha;


}
