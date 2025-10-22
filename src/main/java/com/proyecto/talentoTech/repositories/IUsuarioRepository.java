package com.proyecto.talentoTech.repositories;

import com.proyecto.talentoTech.models.UsuariosModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuariosModel,Long> {
    Optional<UsuariosModel> findByUsernameAndPassword(String username, String password);
}
