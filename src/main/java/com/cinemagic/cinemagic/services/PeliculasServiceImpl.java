package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Peliculas;
import com.cinemagic.cinemagic.repositories.PeliculasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class PeliculasServiceImpl implements PeliculasServiceInterface {

    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public Peliculas getPeliculaById(Long id) {
        return null;
    }

    @Override
    public List<Peliculas> getAllPeliculas() {
        return List.of();
    }

    @Transactional
    @Override
    public Peliculas savePelicula(Peliculas pelicula) {
        return null;
    }

    @Transactional
    @Override
    public Peliculas updatePelicula(Peliculas pelicula) {
        return null;
    }
    
    @Transactional
    @Override
    public void deletePeliculaById(Long id) {

    }
}
