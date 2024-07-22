package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Usuarios;

import java.util.List;

public interface UsuariosServiceInterface {
    Usuarios getUsuarioById(Long id);

    List<Usuarios> getAllUsuarios();

    Usuarios saveUsuario(Usuarios usuario);

    Usuarios updateUsuario(Usuarios usuario);

    void deleteUsuarioById(Long id);
}
