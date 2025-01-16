/*

package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Juez;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_audiencias.audiencias.repositorio.JuezRepository;

import java.util.List;

@Service
public class JuezService {

    @Autowired
    private JuezRepository juezRepository;

    public List<Juez> obtenerTodosLosJueces() {
        return juezRepository.findAll();
    }

    public Juez obtenerJuezPorId(Long id) {
        return juezRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Juez no encontrado"));
    }

    public Juez crearJuez(Juez juez) {
        return juezRepository.save(juez);
    }

    public Juez actualizarJuez(Long id, Juez nuevoJuez) {
        Juez juezExistente = obtenerJuezPorId(id);
        juezExistente.setNombre(nuevoJuez.getNombre());
        juezExistente.setApellido(nuevoJuez.getApellido());
        juezExistente.setFechaNacimiento(nuevoJuez.getFechaNacimiento());
        juezExistente.setEmail(nuevoJuez.getEmail());
        juezExistente.setTelefono(nuevoJuez.getTelefono());
        juezExistente.setDireccion(nuevoJuez.getDireccion());
        return juezRepository.save(juezExistente);
    }

    public void eliminarJuez(Long id) {
        juezRepository.deleteById(id);
    }

}



 */



package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Juez;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_audiencias.audiencias.repositorio.JuezRepository;

import java.util.List;

@Service
public class JuezService {

    @Autowired
    private JuezRepository juezRepository;

    public List<Juez> obtenerTodosLosJueces() {
        return juezRepository.findAll();
    }

    public Juez obtenerJuezPorId(Long id) {
        return juezRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Juez no encontrado"));
    }

    public Juez crearJuez(Juez juez) {
        return juezRepository.save(juez);
    }

    public Juez actualizarJuez(Long id, Juez nuevoJuez) {
        Juez juezExistente = obtenerJuezPorId(id);
        juezExistente.setNombre(nuevoJuez.getNombre());
        juezExistente.setApellido(nuevoJuez.getApellido());
        juezExistente.setFecha_nacimiento(nuevoJuez.getFecha_nacimiento());
        juezExistente.setEmail(nuevoJuez.getEmail());
        juezExistente.setTelefono(nuevoJuez.getTelefono());
        juezExistente.setDireccion(nuevoJuez.getDireccion());
        return juezRepository.save(juezExistente);
    }

    public void eliminarJuez(Long id) {
        juezRepository.deleteById(id);
    }
}