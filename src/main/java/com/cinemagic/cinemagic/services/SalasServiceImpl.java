package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Salas;
import com.cinemagic.cinemagic.repositories.SalasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class SalasServiceImpl implements SalasServiceInterface {

    @Autowired
    private SalasRepository salasRepository;

    @Override
    public Salas getSalaById(Long id) {
        return salasRepository.findById(id).orElse(null);
    }

    @Override
    public List<Salas> getAllSalas() {
        return salasRepository.findAll();
    }

    @Transactional
    @Override
    public Salas saveSala(Salas sala) {
        return salasRepository.save(sala);
    }

    @Transactional
    @Override
    public Salas updateSala(Salas sala) {
        return salasRepository.save(sala);
    }

    @Transactional
    @Override
    public void deleteSalaById(Long id) {
        salasRepository.deleteById(id);
    }
}
