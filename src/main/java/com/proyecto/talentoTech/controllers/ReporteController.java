package com.proyecto.talentoTech.controllers;

import com.proyecto.talentoTech.models.ReporteModel;

import com.proyecto.talentoTech.servicios.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/reporte")
public class ReporteController {
    @Autowired
    private ReporteService reporteService;

    @GetMapping
    public ArrayList<ReporteModel> getReporte() {
        return this.reporteService.getReporte();
    }

    @PostMapping
    public ReporteModel saveReporte(@RequestBody ReporteModel user) {
        return this.reporteService.saveReporte(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<ReporteModel> getReporteById(@PathVariable("id") Long id) {
        return this.reporteService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ReporteModel updateReporteById(@RequestBody ReporteModel request, @PathVariable("id") Long id ) {
        return this.reporteService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> deleteReporteById(@PathVariable("id") Long id) {
        boolean ok = this.reporteService.deleteReporte(id);
        if (ok) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
