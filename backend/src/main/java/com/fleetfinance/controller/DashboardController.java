
package com.fleetfinance.controller;

import org.springframework.web.bind.annotation.*;
import com.fleetfinance.service.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final ResultadoService resultadoService;

    public DashboardController(ResultadoService resultadoService) {
        this.resultadoService = resultadoService;
    }

    @GetMapping("/resultado")
    public Object resultado() {
        return resultadoService.calcularResultado();
    }
}
