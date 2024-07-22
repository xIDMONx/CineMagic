package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Horarios;

import java.util.List;

public interface HorariosServiceInterface {
    Horarios getHorarioById(Long id);

    List<Horarios> getAllHorarios();

    Horarios saveHorario(Horarios horario);

    Horarios updateHorario(Horarios horario);

    void deleteHorarioById(Long id);
}
