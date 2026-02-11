
package com.fleetfinance.service;

import org.springframework.stereotype.Service;
import com.fleetfinance.repository.*;

@Service
public class FinanciamentoService {

    private final FinanciamentoRepository financiamentoRepository;

    public FinanciamentoService(FinanciamentoRepository financiamentoRepository) {
        this.financiamentoRepository = financiamentoRepository;
    }

    // REGRA:
    // Financiamento NÃO é despesa
    // Parcela entra no caixa e no DRE

    public java.util.List<com.fleetfinance.model.Financiamento> listar() {
        return financiamentoRepository.findAll();
    }
}
