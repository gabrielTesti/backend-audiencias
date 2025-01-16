/*
package com.proyecto_audiencias.audiencias.controller;

import com.proyecto_audiencias.audiencias.modelo.Fiscal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.proyecto_audiencias.audiencias.service.FiscalService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/fiscales")
public class FiscalController {

    @Autowired
    private FiscalService fiscalService;

    @GetMapping
    public List<Fiscal> obtenerTodosLosFiscales() {
        return fiscalService.obtenerTodosLosFiscales();
    }

    @GetMapping("/{id}")
    public Fiscal obtenerFiscalPorId(@PathVariable Long id) {
        return fiscalService.obtenerFiscalPorId(id);
    }

    @PostMapping
    public Fiscal crearFiscal(@RequestBody Fiscal fiscal) {
        return fiscalService.crearFiscal(fiscal);
    }

    @PutMapping("/{id}")
    public Fiscal actualizarFiscal(@PathVariable Long id, @RequestBody Fiscal fiscal) {
        return fiscalService.actualizarFiscal(id, fiscal);
    }

    @DeleteMapping("/{id}")
    public void eliminarFiscal(@PathVariable Long id) {
        fiscalService.eliminarFiscal(id);
    }
}


 */


package com.proyecto_audiencias.audiencias.controller;

import com.proyecto_audiencias.audiencias.modelo.Fiscal;
import com.proyecto_audiencias.audiencias.service.FiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/fiscales")
public class FiscalController {

    @Autowired
    private FiscalService fiscalService;

    @GetMapping
    public List<Fiscal> obtenerTodosLosFiscales() {
        return fiscalService.obtenerTodosLosFiscales();
    }

    @GetMapping("/{id}")
    public Fiscal obtenerFiscalPorId(@PathVariable Long id) {
        return fiscalService.obtenerFiscalPorId(id);
    }

    @PostMapping
    public Fiscal crearFiscal(@RequestBody Fiscal fiscal) {
        return fiscalService.crearFiscal(fiscal);
    }

    @PutMapping("/{id}")
    public Fiscal actualizarFiscal(@PathVariable Long id, @RequestBody Fiscal fiscal) {
        return fiscalService.actualizarFiscal(id, fiscal);
    }

    @DeleteMapping("/{id}")
    public void eliminarFiscal(@PathVariable Long id) {
        fiscalService.eliminarFiscal(id);
    }
}