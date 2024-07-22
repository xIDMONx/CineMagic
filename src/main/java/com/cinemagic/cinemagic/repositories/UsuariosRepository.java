package com.cinemagic.cinemagic.repositories;

import com.cinemagic.cinemagic.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;

@Transactional
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
