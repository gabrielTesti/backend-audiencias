/*
package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Fiscal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_audiencias.audiencias.repositorio.FiscalRepository;

import java.util.List;

@Service
public class FiscalService {

    @Autowired
    private FiscalRepository fiscalRepository;

    public List<Fiscal> obtenerTodosLosFiscales() {
        return fiscalRepository.findAll();
    }

    public Fiscal obtenerFiscalPorId(Long id) {
        return fiscalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fiscal no encontrado"));
    }

    public Fiscal crearFiscal(Fiscal fiscal) {
        return fiscalRepository.save(fiscal);
    }

    public Fiscal actualizarFiscal(Long id, Fiscal nuevoFiscal) {
        Fiscal fiscalExistente = obtenerFiscalPorId(id);
        fiscalExistente.setNombre(nuevoFiscal.getNombre());
        fiscalExistente.setApellido(nuevoFiscal.getApellido());
        fiscalExistente.setFechaNacimiento(nuevoFiscal.getFechaNacimiento());
        fiscalExistente.setEmail(nuevoFiscal.getEmail());
        fiscalExistente.setTelefono(nuevoFiscal.getTelefono());
        fiscalExistente.setDireccion(nuevoFiscal.getDireccion());
        return fiscalRepository.save(fiscalExistente);
    }

    public void eliminarFiscal(Long id) {
        fiscalRepository.deleteById(id);
    }
}

 */

package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Fiscal;
import com.proyecto_audiencias.audiencias.repositorio.FiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiscalService {

    @Autowired
    private FiscalRepository fiscalRepository;

    public List<Fiscal> obtenerTodosLosFiscales() {
        return fiscalRepository.findAll();
    }

    public Fiscal obtenerFiscalPorId(Long id) {
        return fiscalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fiscal no encontrado"));
    }

    public Fiscal crearFiscal(Fiscal fiscal) {
        return fiscalRepository.save(fiscal);
    }

    public Fiscal actualizarFiscal(Long id, Fiscal nuevoFiscal) {
        Fiscal fiscalExistente = obtenerFiscalPorId(id);
        fiscalExistente.setNombre(nuevoFiscal.getNombre());
        fiscalExistente.setApellido(nuevoFiscal.getApellido());
        fiscalExistente.setFecha_nacimiento(nuevoFiscal.getFecha_nacimiento());
        fiscalExistente.setEmail(nuevoFiscal.getEmail());
        fiscalExistente.setTelefono(nuevoFiscal.getTelefono());
        fiscalExistente.setDireccion(nuevoFiscal.getDireccion());
        return fiscalRepository.save(fiscalExistente);
    }

    public void eliminarFiscal(Long id) {
        fiscalRepository.deleteById(id);
    }
}