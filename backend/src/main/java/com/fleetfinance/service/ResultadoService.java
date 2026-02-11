
package com.fleetfinance.service;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class ResultadoService {

    private final DreService dreService;

    public ResultadoService(DreService dreService) {
        this.dreService = dreService;
    }

    public BigDecimal calcularResultado() {
        return dreService.calcularResultadoMensal();
    }
}
