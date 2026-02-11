
package com.fleetfinance.controller;

import org.springframework.web.bind.annotation.*;
import com.fleetfinance.service.*;

@RestController
@RequestMapping("/api/export")
public class ExportController {

    private final ExportService exportService;

    public ExportController(ExportService exportService) {
        this.exportService = exportService;
    }

    @GetMapping("/pdf")
    public byte[] pdf() {
        return exportService.exportarPDF();
    }

    @GetMapping("/excel")
    public byte[] excel() {
        return exportService.exportarExcel();
    }
}
