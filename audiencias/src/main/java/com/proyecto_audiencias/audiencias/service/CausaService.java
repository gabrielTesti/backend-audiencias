  package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Causa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_audiencias.audiencias.repositorio.CausaRepository;

import java.util.List;

@Service
public class CausaService {

    @Autowired
    private CausaRepository causaRepository;

    public List<Causa> obtenerTodasLasCausas() {
        return causaRepository.findAll();
    }

    public Causa obtenerCausaPorId(Long id) {
        return causaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Causa no encontrada"));
    }

    public Causa crearCausa(Causa causa) {
        return causaRepository.save(causa);
    }

    public Causa actualizarCausa(Long id, Causa nuevaCausa) {
        Causa causaExistente = obtenerCausaPorId(id);
        causaExistente.setDescripcion(nuevaCausa.getDescripcion());
        return causaRepository.save(causaExistente);
    }

    public void eliminarCausa(Long id) {
        causaRepository.deleteById(id);
    }

}



