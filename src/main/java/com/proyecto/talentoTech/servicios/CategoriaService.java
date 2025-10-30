package com.proyecto.talentoTech.servicios;

import com.proyecto.talentoTech.models.CategoriaModel;
import com.proyecto.talentoTech.models.ReporteModel;
import com.proyecto.talentoTech.repositories.ICategoriaRepository;
import com.proyecto.talentoTech.repositories.IReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class CategoriaService {
    @Autowired
    ICategoriaRepository categoriaRepository;

    public ArrayList<CategoriaModel> getCategoria(){
        return (ArrayList<CategoriaModel>) categoriaRepository.findAll();
    }

}
