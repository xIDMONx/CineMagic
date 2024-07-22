package com.cinemagic.cinemagic.repositories;

import com.cinemagic.cinemagic.models.Calificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;

@Transactional
public interface CalificacionesRepository extends JpaRepository<Calificaciones, Long> {
}
