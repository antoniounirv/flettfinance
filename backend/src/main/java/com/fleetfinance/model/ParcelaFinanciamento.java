
package com.fleetfinance.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ParcelaFinanciamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    private BigDecimal valor;
    private LocalDate vencimento;

    @ManyToOne
    private Financiamento financiamento;

    public Long getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public Financiamento getFinanciamento() {
        return financiamento;
    }
}
