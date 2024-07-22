package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Calificaciones;

import java.util.List;

public interface CalificacionesServiceInterface {
    Calificaciones getCalificacionById(Long id);

    List<Calificaciones> getAllCalificaciones();

    Calificaciones saveCalificacion(Calificaciones calificacion);

    Calificaciones updateCalificacion(Calificaciones calificacion);

    void deleteCalificacionById(Long id);
}
