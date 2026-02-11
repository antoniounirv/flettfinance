
package com.fleetfinance.model;

import jakarta.persistence.*;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String descricao;

    @ManyToOne
    private Empresa empresa;

    public Long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getDescricao() {
        return descricao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
