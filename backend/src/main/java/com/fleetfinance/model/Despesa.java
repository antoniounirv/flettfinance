
package com.fleetfinance.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private BigDecimal valorTotal;
    private int numeroParcelas;
    private boolean financiamento;

    private LocalDate data;

    @ManyToOne
    private Empresa empresa;

    @OneToMany(mappedBy = "despesa", cascade = CascadeType.ALL)
    private List<Parcela> parcelas;

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public boolean isFinanciamento() {
        return financiamento;
    }

    public LocalDate getData() {
        return data;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
}
