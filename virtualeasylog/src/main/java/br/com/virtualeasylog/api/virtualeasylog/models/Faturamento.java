package br.com.virtualeasylog.api.virtualeasylog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="faturamento")
@Data
@NoArgsConstructor
public class Faturamento {

    @Id
    public int id;

    public int despesa;

    public int ganho;

    private LocalDate data;

}
