package com.upiiz.diagrama1.controllers;

import com.upiiz.diagrama1.models.Trabajadores;
import com.upiiz.diagrama1.services.TrabajadoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trabajadores")
public class TrabajadoresController {
    TrabajadoresService trabajadoresService;

    public TrabajadoresController(TrabajadoresService trabajadoresService) {
        this.trabajadoresService = trabajadoresService;
    }

    @GetMapping
    public ResponseEntity<List<Trabajadores>> getTrabajadores(){
        return ResponseEntity.ok(trabajadoresService.getAllTrabajadores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trabajadores> getTrabajadorPorId(@PathVariable Long id){
        return ResponseEntity.ok(trabajadoresService.getTrabajadorById(id));
    }

    @PostMapping
    public ResponseEntity<Trabajadores> addTrabajador(@RequestBody Trabajadores trabajador){
        return ResponseEntity.ok(trabajadoresService.guardarTrabajador(trabajador));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Trabajadores> actualizarTrabajador(@RequestBody Trabajadores trabajador, @PathVariable Long id){
        trabajador.setId(id);
        return ResponseEntity.ok(trabajadoresService.updateTrabajador(trabajador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTrabajador(@PathVariable Long id){
        trabajadoresService.deleteTrabajador(id);
        return ResponseEntity.noContent().build();
    }
}
