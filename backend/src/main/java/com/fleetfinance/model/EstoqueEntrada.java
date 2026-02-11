
package com.fleetfinance.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class EstoqueEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String produto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
    private LocalDate data;

    @ManyToOne
    private Empresa empresa;

    public Long getId() {
        return id;
    }

    public String getProduto() {
        return produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
