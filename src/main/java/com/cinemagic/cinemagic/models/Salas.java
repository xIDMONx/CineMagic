package com.cinemagic.cinemagic.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "salas")
public class Salas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nombre es requerido")
    private String nombre;

    @Column(name = "asientos_total")
    private Long asientosTotal;

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

    public Long getAsientosTotal() {
        return asientosTotal;
    }

    public void setAsientosTotal(Long asientosTotal) {
        this.asientosTotal = asientosTotal;
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
        return "Salas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", asientosTotal=" + asientosTotal +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
