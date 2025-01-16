package com.proyecto_audiencias.audiencias.controller;

import com.proyecto_audiencias.audiencias.modelo.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_audiencias.audiencias.service.SalaService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> obtenerTodasLasSalas() {
        return salaService.obtenerTodasLasSalas();
    }

    @GetMapping("/{id}")
    public Sala obtenerSalaPorId(@PathVariable Long id) {
        return salaService.obtenerSalaPorId(id);
    }

    @PostMapping
    public Sala crearSala(@RequestBody Sala sala) {
        return salaService.crearSala(sala);
    }

    @PutMapping("/{id}")
    public Sala actualizarSala(@PathVariable Long id, @RequestBody Sala sala) {
        return salaService.actualizarSala(id, sala);
    }

    @DeleteMapping("/{id}")
    public void eliminarSala(@PathVariable Long id) {
        salaService.eliminarSala(id);
    }
}
