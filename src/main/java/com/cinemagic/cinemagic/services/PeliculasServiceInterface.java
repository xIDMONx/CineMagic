package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Peliculas;

import java.util.List;

public interface PeliculasServiceInterface {
    Peliculas getPeliculaById(Long id);

    List<Peliculas> getAllPeliculas();

    Peliculas savePelicula(Peliculas pelicula);

    Peliculas updatePelicula(Peliculas pelicula);

    void deletePeliculaById(Long id);
}
