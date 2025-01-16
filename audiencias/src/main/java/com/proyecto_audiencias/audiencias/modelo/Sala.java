package com.proyecto_audiencias.audiencias.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "sala")

public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Sala;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "ubicacion", nullable = false)
    private String ubicacion;


    public Long getId_Sala() {
        return id_Sala;
    }

    public void setId_Sala(Long id_Sala) {
        this.id_Sala = id_Sala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}