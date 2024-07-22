package com.cinemagic.cinemagic.repositories;

import com.cinemagic.cinemagic.models.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;

@Transactional
public interface TicketsRepository extends JpaRepository<Tickets, Long> {
}
