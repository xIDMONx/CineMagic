package com.cinemagic.cinemagic.services;

import com.cinemagic.cinemagic.models.Usuarios;
import com.cinemagic.cinemagic.repositories.UsuariosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosServiceInterface {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuarios getUsuarioById(Long id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuarios> getAllUsuarios() {
        return usuariosRepository.findAll();
    }

    @Transactional
    @Override
    public Usuarios saveUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    @Transactional
    @Override
    public Usuarios updateUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    @Transactional
    @Override
    public void deleteUsuarioById(Long id) {
        usuariosRepository.deleteById(id);
    }
}
