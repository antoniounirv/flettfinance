
package com.fleetfinance.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Financiamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private BigDecimal valorTotal;
    private int parcelas;

    @ManyToOne
    private Empresa empresa;

    @OneToMany(mappedBy = "financiamento", cascade = CascadeType.ALL)
    private List<ParcelaFinanciamento> listaParcelas;

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public int getParcelas() {
        return parcelas;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public List<ParcelaFinanciamento> getListaParcelas() {
        return listaParcelas;
    }
}
