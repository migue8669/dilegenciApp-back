package com.proyecto.servicios;

import com.proyecto.models.UsuariosModel;
import com.proyecto.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuariosService {
    @Autowired
    IUsuarioRepository usuarioRepository;

    public ArrayList<UsuariosModel> getUsuarios(){
        return (ArrayList<UsuariosModel>) usuarioRepository.findAll();
    }

    public UsuariosModel saveUsuarios(UsuariosModel user){
        return usuarioRepository.save(user);
    }

    public Optional<UsuariosModel> getById(Long id){
        return usuarioRepository.findById(id);
    }
    public UsuariosModel updateById(UsuariosModel request, Long id){
        UsuariosModel user=usuarioRepository.findById(id).get();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        return user;
    }
    public Boolean deleteUsuario(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
