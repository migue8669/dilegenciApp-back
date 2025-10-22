package com.proyecto.talentoTech.servicios;

import com.proyecto.talentoTech.models.UsuariosModel;
import com.proyecto.talentoTech.repositories.IUsuarioRepository;
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

    public Optional<UsuariosModel> authenticateUser(String username, String password) {
        // 1. El repositorio busca al usuario SÓLO si el username Y el password coinciden.
        Optional<UsuariosModel> user = usuarioRepository.findByUsernameAndPassword(username, password);

        // 2. Retorna el resultado del repositorio.
        // Si el usuario fue encontrado, devuelve Optional con el usuario.
        // Si no fue encontrado (credenciales incorrectas), devuelve Optional.empty().
        return user;
    } public UsuariosModel updateById(UsuariosModel request, Long id){
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
