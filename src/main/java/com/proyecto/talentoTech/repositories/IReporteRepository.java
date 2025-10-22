package com.proyecto.talentoTech.repositories;

import com.proyecto.talentoTech.models.ReporteModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReporteRepository extends JpaRepository<ReporteModels,Long> {
}
