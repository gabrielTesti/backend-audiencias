 package com.proyecto_audiencias.audiencias.controller;







import com.proyecto_audiencias.audiencias.modelo.Audiencia;
import com.proyecto_audiencias.audiencias.service.AudienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/audiencias")
public class AudienciaController {

    @Autowired
    private AudienciaService audienciaService;

    @GetMapping
    public List<Audiencia> obtenerAudiencias() {
        return audienciaService.obtenerAudiencias();
    }

    @GetMapping("/{id}")
    public Audiencia obtenerAudienciaPorId(@PathVariable Long id) {
        return audienciaService.obtenerAudienciaPorId(id);
    }

    @PostMapping
    public Audiencia crearAudiencia(@RequestBody Audiencia audiencia) {
        return audienciaService.crearAudiencia(audiencia);
    }

    @PutMapping("/{id}")
    public Audiencia actualizarAudiencia(@PathVariable Long id, @RequestBody Audiencia audiencia) {
        return audienciaService.actualizarAudiencia(id, audiencia);
    }

    @DeleteMapping("/{id}")
    public void eliminarAudiencia(@PathVariable Long id) {
        audienciaService.eliminarAudiencia(id);
    }
}





