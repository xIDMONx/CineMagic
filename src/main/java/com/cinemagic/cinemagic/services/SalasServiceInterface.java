package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Salas;

import java.util.List;

public interface SalasServiceInterface {
    Salas getSalaById(Long id);

    List<Salas> getAllSalas();

    Salas saveSala(Salas sala);

    Salas updateSala(Salas sala);

    void deleteSalaById(Long id);
}
