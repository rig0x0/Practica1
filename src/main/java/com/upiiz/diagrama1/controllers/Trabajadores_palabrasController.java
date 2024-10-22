package com.upiiz.diagrama1.controllers;

import com.upiiz.diagrama1.models.Trabajadores_palabras;
import com.upiiz.diagrama1.services.Trabajadores_palabrasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Trabajadores_palabrasController {
    Trabajadores_palabrasService trabajadoresPalabrasService;

    public Trabajadores_palabrasController(Trabajadores_palabrasService trabajadoresPalabrasService) {
        this.trabajadoresPalabrasService = trabajadoresPalabrasService;
    }

    @GetMapping("/palabras")
    public ResponseEntity<List<Trabajadores_palabras>> getPalabras(){
        return ResponseEntity.ok(trabajadoresPalabrasService.getAllPalabras());
    }

    @GetMapping("/palabras/{id}")
    public ResponseEntity<Trabajadores_palabras> getPalabrasPorId(@PathVariable Long id){
        return ResponseEntity.ok(trabajadoresPalabrasService.getPalabraById(id));
    }

    @PostMapping("/respuesta/{respuesta_id}/palabras")
    public ResponseEntity<Trabajadores_palabras> addPalabras(@RequestBody Trabajadores_palabras palabra, @PathVariable Integer respuesta_id){
        palabra.setRespuestaTrabajadores_id(respuesta_id);
        return ResponseEntity.ok(trabajadoresPalabrasService.guardarPalabra(palabra));
    }

    @PutMapping("/respuesta/{respuesta_id}/palabras/{id}")
    public ResponseEntity<Trabajadores_palabras> actualizarPalabra(@RequestBody Trabajadores_palabras palabra, @PathVariable Long id, @PathVariable Integer respuesta_id){
        palabra.setId(id);
        palabra.setRespuestaTrabajadores_id(respuesta_id);
        return ResponseEntity.ok(trabajadoresPalabrasService.updatePalabra(palabra));
    }

    @DeleteMapping("/palabras/{id}")
    public ResponseEntity<Void> eliminarPalabra(@PathVariable Long id){
        trabajadoresPalabrasService.deletePalabra(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/respuesta/{respuesta_id}/palabras")
    public ResponseEntity<List<Trabajadores_palabras>> obtenerAllPalabrasDeRespuestaById(@PathVariable Integer respuesta_id){
        return ResponseEntity.ok(trabajadoresPalabrasService.getAllPalabrasPorRespuestaById(respuesta_id));
    }

    @GetMapping("/respuesta/{respuesta_id}/palabras/{id}")
    public ResponseEntity<Trabajadores_palabras> obtenerPalabraByIdDeRespuestaById(@PathVariable Integer respuesta_id, @PathVariable Long id){
        return ResponseEntity.ok(trabajadoresPalabrasService.getPalabraByIdPorRespuestaId(respuesta_id, id));
    }
}
