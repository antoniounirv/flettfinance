package com.fleetfinance.model;

import jakarta.persistence.*;

@Entity
public class Parcela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numero;
    private Double valor;
    private boolean paga;

    @ManyToOne
    @JoinColumn(name = "despesa_id")
    private Despesa despesa;

    public Long getId() {
        return id;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getValor() {
        return valor;
    }

    public boolean isPaga() {
        return paga;
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }
}
