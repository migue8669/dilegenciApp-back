package com.proyecto.repositories;

import com.proyecto.models.ReporteModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReporteRepository extends JpaRepository<ReporteModels,Long> {
}
