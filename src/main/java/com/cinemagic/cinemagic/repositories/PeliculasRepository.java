package com.cinemagic.cinemagic.repositories;

import com.cinemagic.cinemagic.models.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;

@Transactional
public interface PeliculasRepository extends JpaRepository<Peliculas, Long> {
}
