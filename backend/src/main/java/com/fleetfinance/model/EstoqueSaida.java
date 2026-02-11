
package com.fleetfinance.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class EstoqueSaida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String produto;
    private BigDecimal quantidade;
    private BigDecimal valorCusto;
    private LocalDate data;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private Veiculo veiculo;

    public Long getId() {
        return id;
    }

    public String getProduto() {
        return produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValorCusto() {
        return valorCusto;
    }

    public LocalDate getData() {
        return data;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}
