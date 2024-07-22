package com.cinemagic.cinemagic.repositories;

import com.cinemagic.cinemagic.models.Salas;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;

@Transactional
public interface SalasRepository extends JpaRepository<Salas, Long> {
}
