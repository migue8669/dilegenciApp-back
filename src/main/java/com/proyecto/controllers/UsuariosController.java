package com.proyecto.controllers;

import com.proyecto.models.UsuariosModel;
import com.proyecto.servicios.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public ArrayList<UsuariosModel> getUsuarios(){
        return this.usuariosService.getUsuarios();
    }

    @PostMapping
    public UsuariosModel saveUsuario(@RequestBody UsuariosModel user) {
        return this.usuariosService.saveUsuarios(user);
    }

   @GetMapping(path="/{id}")
    public Optional<UsuariosModel> getUsuarioById(@PathVariable("id") Long id){
        return this.usuariosService.getById(id);
   }

   @PutMapping(path="/{id}")
    public UsuariosModel updateUsuarioById(@RequestBody UsuariosModel request, Long id){
      return this.usuariosService.updateById(request,id);
   }
   @DeleteMapping(path = "/{id}")
    public String deleteUsuarioById(@PathVariable("id") Long id){
        boolean ok = this.usuariosService.deleteUsuario(id);
        if(ok){
            return id+" eliminado";
        }else {
            return "Error al eliminar";
        }
   }
}
