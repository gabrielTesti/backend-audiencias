/*
package com.proyecto_audiencias.audiencias.controller;

import com.proyecto_audiencias.audiencias.modelo.Defensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_audiencias.audiencias.service.DefensorService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/defensores")
public class DefensorController {

    @Autowired
    private DefensorService defensorService;

    @GetMapping
    public List<Defensor> obtenerTodosLosDefensores() {
        return defensorService.obtenerTodosLosDefensores();
    }

    @GetMapping("/{id}")
    public Defensor obtenerDefensorPorId(@PathVariable Long id) {
        return defensorService.obtenerDefensorPorId(id);
    }

    @PostMapping
    public Defensor crearDefensor(@RequestBody Defensor defensor) {
        return defensorService.crearDefensor(defensor);
    }

    @PutMapping("/{id}")
    public Defensor actualizarDefensor(@PathVariable Long id, @RequestBody Defensor defensor) {
        return defensorService.actualizarDefensor(id, defensor);
    }

    @DeleteMapping("/{id}")
    public void eliminarDefensor(@PathVariable Long id) {
        defensorService.eliminarDefensor(id);
    }
}





 */


package com.proyecto_audiencias.audiencias.controller;

import com.proyecto_audiencias.audiencias.modelo.Defensor;
import com.proyecto_audiencias.audiencias.service.DefensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/defensores")
public class DefensorController {

    @Autowired
    private DefensorService defensorService;

    @GetMapping
    public List<Defensor> obtenerTodosLosDefensores() {
        return defensorService.obtenerTodosLosDefensores();
    }

    @GetMapping("/{id}")
    public Defensor obtenerDefensorPorId(@PathVariable Long id) {
        return defensorService.obtenerDefensorPorId(id);
    }

    @PostMapping
    public Defensor crearDefensor(@RequestBody Defensor defensor) {
        return defensorService.crearDefensor(defensor);
    }

    @PutMapping("/{id}")
    public Defensor actualizarDefensor(@PathVariable Long id, @RequestBody Defensor defensor) {
        return defensorService.actualizarDefensor(id, defensor);
    }

    @DeleteMapping("/{id}")
    public void eliminarDefensor(@PathVariable Long id) {
        defensorService.eliminarDefensor(id);
    }
}