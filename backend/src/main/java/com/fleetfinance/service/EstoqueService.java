
package com.fleetfinance.service;

import org.springframework.stereotype.Service;
import com.fleetfinance.repository.*;

@Service
public class EstoqueService {

    private final EstoqueEntradaRepository entradaRepository;
    private final EstoqueSaidaRepository saidaRepository;

    public EstoqueService(EstoqueEntradaRepository entradaRepository,
                          EstoqueSaidaRepository saidaRepository) {
        this.entradaRepository = entradaRepository;
        this.saidaRepository = saidaRepository;
    }

    // REGRA:
    // Entrada de estoque NÃO entra no DRE
    // Saída de estoque entra no DRE mas NÃO entra no caixa

    public java.util.List<com.fleetfinance.model.EstoqueEntrada> listarEntradas() {
        return entradaRepository.findAll();
    }

    public java.util.List<com.fleetfinance.model.EstoqueSaida> listarSaidas() {
        return saidaRepository.findAll();
    }
}
