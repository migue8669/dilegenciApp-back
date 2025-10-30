package com.proyecto.talentoTech.repositories;

import com.proyecto.talentoTech.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository  extends JpaRepository<CategoriaModel,Long> {
}
