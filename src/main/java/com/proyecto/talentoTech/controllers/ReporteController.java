package com.proyecto.talentoTech.controllers;

import com.proyecto.talentoTech.models.ReporteModels;

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
    public ReporteModels updateReporteById(@RequestBody ReporteModels request, @PathVariable("id") Long id ) {
        return this.reporteService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> deleteReporteById(@PathVariable("id") Long id) {
        boolean ok = this.reporteService.deleteReporte(id);
        if (ok) {
            // Devuelve el código de estado HTTP 204 (No Content) para una eliminación exitosa sin cuerpo.
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            // Devuelve 500 si la eliminación falló en el servicio (o 404 si manejaste la excepción).
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
