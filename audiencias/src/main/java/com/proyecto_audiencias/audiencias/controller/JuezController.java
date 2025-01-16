
/*
package com.proyecto_audiencias.audiencias.controller;

import com.proyecto_audiencias.audiencias.modelo.Juez;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_audiencias.audiencias.service.JuezService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/jueces")
public class JuezController {

    @Autowired
    private JuezService juezService;

    @GetMapping
    public List<Juez> obtenerTodosLosJueces() {
        return juezService.obtenerTodosLosJueces();
    }

    @GetMapping("/{id}")
    public Juez obtenerJuezPorId(@PathVariable Long id) {
        return juezService.obtenerJuezPorId(id);
    }

    @PostMapping
    public Juez crearJuez(@RequestBody Juez juez) {
        return juezService.crearJuez(juez);
    }

    @PutMapping("/{id}")
    public Juez actualizarJuez(@PathVariable Long id, @RequestBody Juez juez) {
        return juezService.actualizarJuez(id, juez);
    }

    @DeleteMapping("/{id}")
    public void eliminarJuez(@PathVariable Long id) {
        juezService.eliminarJuez(id);
    }
}


 */

package com.proyecto_audiencias.audiencias.controller;

import com.proyecto_audiencias.audiencias.modelo.Juez;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_audiencias.audiencias.service.JuezService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/jueces")
public class JuezController {

    @Autowired
    private JuezService juezService;

    @GetMapping
    public List<Juez> obtenerTodosLosJueces() {
        return juezService.obtenerTodosLosJueces();
    }

    @GetMapping("/{id}")
    public Juez obtenerJuezPorId(@PathVariable Long id) {
        return juezService.obtenerJuezPorId(id);
    }

    @PostMapping
    public Juez crearJuez(@RequestBody Juez juez) {
        return juezService.crearJuez(juez);
    }

    @PutMapping("/{id}")
    public Juez actualizarJuez(@PathVariable Long id, @RequestBody Juez juez) {
        return juezService.actualizarJuez(id, juez);
    }

    @DeleteMapping("/{id}")
    public void eliminarJuez(@PathVariable Long id) {
        juezService.eliminarJuez(id);
    }
}