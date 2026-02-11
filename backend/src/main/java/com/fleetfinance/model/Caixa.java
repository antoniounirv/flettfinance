
package com.fleetfinance.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Caixa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private BigDecimal valor;
    private LocalDate data;

    private boolean custoJaAlocado;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private Veiculo veiculo;

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean isCustoJaAlocado() {
        return custoJaAlocado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}
