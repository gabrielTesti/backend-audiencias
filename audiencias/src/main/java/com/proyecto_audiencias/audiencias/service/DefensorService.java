/*
package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Defensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_audiencias.audiencias.repositorio.DefensorRepository;

import java.util.List;

@Service
public class DefensorService {

    @Autowired
    private DefensorRepository defensorRepository;

    public List<Defensor> obtenerTodosLosDefensores() {
        return defensorRepository.findAll();
    }


    public Defensor obtenerDefensorPorId(Long id) {
        return defensorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Defensor no encontrado"));
    }

    public Defensor crearDefensor(Defensor defensor) {
        return defensorRepository.save(defensor);
    }

    public Defensor actualizarDefensor(Long id, Defensor nuevoDefensor) {
        Defensor defensorExistente = obtenerDefensorPorId(id);
        defensorExistente.setNombre(nuevoDefensor.getNombre());
        defensorExistente.setApellido(nuevoDefensor.getApellido());
        defensorExistente.setFechaNacimiento(nuevoDefensor.getFechaNacimiento());
        defensorExistente.setEmail(nuevoDefensor.getEmail());
        defensorExistente.setTelefono(nuevoDefensor.getTelefono());
        defensorExistente.setDireccion(nuevoDefensor.getDireccion());
        return defensorRepository.save(defensorExistente);
    }

    public void eliminarDefensor(Long id) {
        defensorRepository.deleteById(id);
    }
}

 */

package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Defensor;
import com.proyecto_audiencias.audiencias.repositorio.DefensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefensorService {

    @Autowired
    private DefensorRepository defensorRepository;

    public List<Defensor> obtenerTodosLosDefensores() {
        return defensorRepository.findAll();
    }

    public Defensor obtenerDefensorPorId(Long id) {
        return defensorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Defensor no encontrado"));
    }

    public Defensor crearDefensor(Defensor defensor) {
        return defensorRepository.save(defensor);
    }

    public Defensor actualizarDefensor(Long id, Defensor nuevoDefensor) {
        Defensor defensorExistente = obtenerDefensorPorId(id);
        defensorExistente.setNombre(nuevoDefensor.getNombre());
        defensorExistente.setApellido(nuevoDefensor.getApellido());
        defensorExistente.setFecha_nacimiento(nuevoDefensor.getFecha_nacimiento());
        defensorExistente.setEmail(nuevoDefensor.getEmail());
        defensorExistente.setTelefono(nuevoDefensor.getTelefono());
        defensorExistente.setDireccion(nuevoDefensor.getDireccion());
        return defensorRepository.save(defensorExistente);
    }

    public void eliminarDefensor(Long id) {
        defensorRepository.deleteById(id);
    }
}