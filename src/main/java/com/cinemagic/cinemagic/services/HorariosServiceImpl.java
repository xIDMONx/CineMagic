package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Horarios;
import com.cinemagic.cinemagic.repositories.HorariosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class HorariosServiceImpl implements HorariosServiceInterface {

    @Autowired
    private HorariosRepository horariosRepository;

    @Override
    public Horarios getHorarioById(Long id) {
        return horariosRepository.findById(id).orElse(null);
    }

    @Override
    public List<Horarios> getAllHorarios() {
        return horariosRepository.findAll();
    }

    @Transactional
    @Override
    public Horarios saveHorario(Horarios horario) {
        return horariosRepository.save(horario);
    }

    @Transactional
    @Override
    public Horarios updateHorario(Horarios horario) {
        return horariosRepository.save(horario);
    }

    @Transactional
    @Override
    public void deleteHorarioById(Long id) {
        horariosRepository.deleteById(id);
    }
}
