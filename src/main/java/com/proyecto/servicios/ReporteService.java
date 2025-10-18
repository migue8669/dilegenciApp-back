package com.proyecto.servicios;

import com.proyecto.models.ReporteModels;
import com.proyecto.repositories.IReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ReporteService {
    @Autowired
    IReporteRepository reporteRepository;

    public ArrayList<ReporteModels> getReporte(){
        return (ArrayList<ReporteModels>) reporteRepository.findAll();
    }

    public ReporteModels saveReporte(ReporteModels report){
        return reporteRepository.save(report);
    }

    public Optional<ReporteModels> getById(Long id){
        return reporteRepository.findById(id);
    }
    public ReporteModels updateById(ReporteModels request, Long id){
        ReporteModels report=reporteRepository.findById(id).get();
        report.setTitle(request.getTitle());
        report.setServicio(request.getServicio());
        report.setPrecio(request.getPrecio());
        report.setDireccion(request.getDireccion());
        report.setTelefono(request.getTelefono());
        report.setLat(request.getLat());
        report.setLng(request.getLng());
        report.setUsuario(request.getUsuario());
        return report;
    }
    public Boolean deleteReporte(Long id){
        try {
            reporteRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
