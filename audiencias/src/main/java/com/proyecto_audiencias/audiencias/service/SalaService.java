package com.proyecto_audiencias.audiencias.service;


import com.proyecto_audiencias.audiencias.modelo.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_audiencias.audiencias.repositorio.SalaRepository;

import java.util.List;

@Service
    public class SalaService {

        @Autowired
        private SalaRepository salaRepository;

        public List<Sala> obtenerTodasLasSalas() {
            return salaRepository.findAll();
        }

        public Sala obtenerSalaPorId(Long id) {
            return salaRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Sala no encontrada"));
        }

        public Sala crearSala(Sala sala) {
            return salaRepository.save(sala);
        }

        public Sala actualizarSala(Long id, Sala nuevaSala) {
            Sala salaExistente = obtenerSalaPorId(id);
            salaExistente.setNombre(nuevaSala.getNombre());
            salaExistente.setUbicacion(nuevaSala.getUbicacion());
            return salaRepository.save(salaExistente);
        }

        public void eliminarSala(Long id) {
            salaRepository.deleteById(id);
        }

}

