package com.proyecto.controllers;

import com.proyecto.models.ReporteModels;

import com.proyecto.servicios.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/reporte")
public class ReporteController {
    @Autowired
    private ReporteService reporteService;

    @GetMapping
    public ArrayList<ReporteModels> getReporte() {
        return this.reporteService.getReporte();
    }

    @PostMapping
    public ReporteModels saveReporte(@RequestBody ReporteModels user) {
        return this.reporteService.saveReporte(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<ReporteModels> getReporteById(@PathVariable("id") Long id) {
        return this.reporteService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ReporteModels updateReporteById(@RequestBody ReporteModels request, Long id) {
        return this.reporteService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteReporteById(@PathVariable("id") Long id) {
        boolean ok = this.reporteService.deleteReporte(id);
        if (ok) {
            return id + " eliminado";
        } else {
            return "Error al eliminar";
        }
    }
}
