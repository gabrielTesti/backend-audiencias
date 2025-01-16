/*
package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Audiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto_audiencias.audiencias.repositorio.AudienciaRepository;

import java.util.List;



    @Service
    public class AudienciaService {

        @Autowired
        private AudienciaRepository audienciaRepository;

        public List<Audiencia> obtenerAudiencias() {
            return audienciaRepository.findAll();
        }

        public Audiencia obtenerAudienciaPorId(Long id) {
            return audienciaRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Audiencia no encontrada"));
        }

        public Audiencia crearAudiencia(Audiencia audiencia) {
            return audienciaRepository.save(audiencia);
        }

        public Audiencia actualizarAudiencia(Long id, Audiencia nuevaAudiencia) {
            Audiencia audienciaExistente = obtenerAudienciaPorId(id);
            // Actualiza los campos
            audienciaExistente.setFecha(nuevaAudiencia.getFecha());
            audienciaExistente.setHora(nuevaAudiencia.getHora());
            audienciaExistente.setDistrito(nuevaAudiencia.getDistrito());
            audienciaExistente.setEstado(nuevaAudiencia.getEstado());
            audienciaExistente.setTipoAudiencia(nuevaAudiencia.getTipoAudiencia());
            audienciaExistente.setSala(nuevaAudiencia.getSala());
            audienciaExistente.setCausa(nuevaAudiencia.getCausa());
            audienciaExistente.setJuez(nuevaAudiencia.getJuez());
            audienciaExistente.setFiscal(nuevaAudiencia.getFiscal());
            audienciaExistente.setDefensor(nuevaAudiencia.getDefensor());
            audienciaExistente.setCuij(nuevaAudiencia.getCuij());


            return audienciaRepository.save(audienciaExistente);
        }

        public void eliminarAudiencia(Long id) {
            audienciaRepository.deleteById(id);
        }

    }


 */


package com.proyecto_audiencias.audiencias.service;

import com.proyecto_audiencias.audiencias.modelo.Audiencia;
import com.proyecto_audiencias.audiencias.repositorio.AudienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudienciaService {

    @Autowired
    private AudienciaRepository audienciaRepository;

    public List<Audiencia> obtenerAudiencias() {
        return audienciaRepository.findAll();
    }

    public Audiencia obtenerAudienciaPorId(Long id) {
        return audienciaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Audiencia no encontrada"));
    }

    public Audiencia crearAudiencia(Audiencia audiencia) {
        return audienciaRepository.save(audiencia);
    }

    public Audiencia actualizarAudiencia(Long id, Audiencia nuevaAudiencia) {
        Audiencia audienciaExistente = obtenerAudienciaPorId(id);
        // Actualiza los campos
        audienciaExistente.setFecha(nuevaAudiencia.getFecha());
        audienciaExistente.setHora(nuevaAudiencia.getHora());
        audienciaExistente.setDistrito(nuevaAudiencia.getDistrito());
        audienciaExistente.setEstado(nuevaAudiencia.getEstado());
        audienciaExistente.setTipo_audiencia(nuevaAudiencia.getTipo_audiencia());
        audienciaExistente.setSala(nuevaAudiencia.getSala());
        audienciaExistente.setCausa(nuevaAudiencia.getCausa());
        audienciaExistente.setJuez(nuevaAudiencia.getJuez());
        audienciaExistente.setFiscal(nuevaAudiencia.getFiscal());
        audienciaExistente.setDefensor(nuevaAudiencia.getDefensor());
        audienciaExistente.setCuij(nuevaAudiencia.getCuij());

        return audienciaRepository.save(audienciaExistente);
    }

    public void eliminarAudiencia(Long id) {
        audienciaRepository.deleteById(id);
    }
}