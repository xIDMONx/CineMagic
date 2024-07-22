package com.cinemagic.cinemagic.repositories;

import com.cinemagic.cinemagic.models.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;

@Transactional
public interface HorariosRepository extends JpaRepository<Horarios, Long> {
}
