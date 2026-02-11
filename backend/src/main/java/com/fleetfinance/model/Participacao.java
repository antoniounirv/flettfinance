package com.fleetfinance.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Participacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String centroCusto;
    private Double percentual; // Ex: 50.0 = 50%

    @ManyToOne
    @JoinColumn(name = "despesa_id")
    private Despesa despesa;

    public Long getId() {
        return id;
    }

    public String getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }

    public BigDecimal getValor() {
        if (despesa == null || despesa.getValorTotal() == null || percentual == null) {
            return BigDecimal.ZERO;
        }
        return despesa.getValorTotal()
            .multiply(BigDecimal.valueOf(percentual))
            .divide(BigDecimal.valueOf(100));
    }
}
