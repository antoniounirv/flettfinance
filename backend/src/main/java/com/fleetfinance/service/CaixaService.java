
package com.fleetfinance.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.fleetfinance.model.*;
import com.fleetfinance.repository.*;

@Service
public class CaixaService {

    private final CaixaRepository caixaRepository;

    public CaixaService(CaixaRepository caixaRepository) {
        this.caixaRepository = caixaRepository;
    }

    // REGRA:
    // Tudo que sai do caixa entra aqui
    // Custo já alocado entra no caixa mas NÃO entra no DRE
    public List<Caixa> listar(Long empresaId) {
        return caixaRepository.findAll();
    }
}
