
package com.fleetfinance.service;

import org.springframework.stereotype.Service;
import com.fleetfinance.repository.*;

@Service
public class FaturamentoService {

    private final FaturamentoRepository faturamentoRepository;

    public FaturamentoService(FaturamentoRepository faturamentoRepository) {
        this.faturamentoRepository = faturamentoRepository;
    }

    // REGRA:
    // Faturamento vem de outro módulo e só impacta DRE/resultado

    public java.util.List<com.fleetfinance.model.Faturamento> listar() {
        return faturamentoRepository.findAll();
    }
}
