package com.proyecto.talentoTech.controllers;


import com.proyecto.talentoTech.models.CategoriaModel;
import com.proyecto.talentoTech.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@CrossOrigin(origins = "http://localhost:4200") // ⬅️ SOLUCIÓN CORS
@RestController
@RequestMapping("/categorias") // ⬅️ Endpoint base para las categorías
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping
    public ArrayList<CategoriaModel> getCategoria() {
        return this.categoriaService.getCategoria();
    }


    // Opcional: Podrías añadir un método GET por ID si fuera necesario
    // @GetMapping(path = "/{id}")
    // public Optional<CategoriaModel> getCategoriaById(@PathVariable("id") Integer id) {
    //     return categoriaRepository.findById(id);
    // }

    // NOTA: Para tablas maestras, generalmente no se incluyen endpoints de POST, PUT o DELETE
    // si solo se requiere lectura desde el frontend.

}