package com.cinemagic.cinemagic.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nombre es requerido")
    private String nombre;

    @NotBlank(message = "Email es requerido")
    private String email;

    @NotBlank(message = "La contraseña es requerida")
    private String password;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nombre es requerido") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotBlank(message = "Nombre es requerido") String nombre) {
        this.nombre = nombre;
    }

    public @NotBlank(message = "Email es requerido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email es requerido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "La contraseña es requerida") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "La contraseña es requerida") String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
