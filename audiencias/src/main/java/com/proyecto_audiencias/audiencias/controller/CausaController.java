 package com.proyecto_audiencias.audiencias.controller;

import com.proyecto_audiencias.audiencias.modelo.Causa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_audiencias.audiencias.service.CausaService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/causas")
public class CausaController {

    @Autowired
    private CausaService causaService;

    @GetMapping
    public List<Causa> obtenerTodasLasCausas() {
        return causaService.obtenerTodasLasCausas();
    }

    @GetMapping("/{id}")
    public Causa obtenerCausaPorId(@PathVariable Long id) {
        return causaService.obtenerCausaPorId(id);
    }

    @PostMapping
    public Causa crearCausa(@RequestBody Causa causa) {
        return causaService.crearCausa(causa);
    }

    @PutMapping("/{id}")
    public Causa actualizarCausa(@PathVariable Long id, @RequestBody Causa causa) {
        return causaService.actualizarCausa(id, causa);
    }

    @DeleteMapping("/{id}")
    public void eliminarCausa(@PathVariable Long id) {
        causaService.eliminarCausa(id);
    }
}




