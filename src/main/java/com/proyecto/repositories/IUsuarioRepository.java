package com.proyecto.repositories;

import com.proyecto.models.UsuariosModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuariosModel,Long> {
}
