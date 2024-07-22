package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Calificaciones;
import com.cinemagic.cinemagic.repositories.CalificacionesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class CalificacionesServiceImpl implements CalificacionesServiceInterface {

    @Autowired
    private CalificacionesRepository calificacionesRepository;

    @Override
    public Calificaciones getCalificacionById(Long id) {
        return calificacionesRepository.findById(id).orElse(null);
    }

    @Override
    public List<Calificaciones> getAllCalificaciones() {
        return calificacionesRepository.findAll();
    }

    @Transactional
    @Override
    public Calificaciones saveCalificacion(Calificaciones calificacion) {
        return calificacionesRepository.save(calificacion);
    }

    @Transactional
    @Override
    public Calificaciones updateCalificacion(Calificaciones calificacion) {
        return calificacionesRepository.save(calificacion);
    }

    @Transactional
    @Override
    public void deleteCalificacionById(Long id) {
        calificacionesRepository.deleteById(id);
    }
}
