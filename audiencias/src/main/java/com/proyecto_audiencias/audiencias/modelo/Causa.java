 package com.proyecto_audiencias.audiencias.modelo;

import jakarta.persistence.*;

    @Entity
    @Table(name = "causa")
    public class Causa {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_Causa;

        @Column(name = "descripcion", nullable = false)
        private String descripcion;



        // Getters y Setters
        public Long getId_Causa() {
            return id_Causa;
        }

        public void setId_Causa(Long id_Causa) {
            this.id_Causa = id_Causa;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }



    }




