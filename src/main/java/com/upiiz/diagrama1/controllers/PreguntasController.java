package com.upiiz.diagrama1.controllers;

import com.upiiz.diagrama1.models.Preguntas;
import com.upiiz.diagrama1.services.PreguntasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/preguntas")
public class PreguntasController {
    PreguntasService preguntasService;

    public PreguntasController(PreguntasService preguntasService) {
        this.preguntasService = preguntasService;
    }

    @GetMapping
    public ResponseEntity<List<Preguntas>> getPreguntas(){
        return ResponseEntity.ok(preguntasService.getAllPreguntas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Preguntas> getPreguntaPorId(@PathVariable Long id){
        return ResponseEntity.ok(preguntasService.getPreguntaById(id));
    }

    @PostMapping
    public ResponseEntity<Preguntas> addPregunta(@RequestBody Preguntas pregunta){
        return ResponseEntity.ok(preguntasService.guardarPregunta(pregunta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Preguntas> actualizarPregunta(@RequestBody Preguntas pregunta, @PathVariable Long id){
        pregunta.setId(id);
        return ResponseEntity.ok(preguntasService.updatePregunta(pregunta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPregunta(@PathVariable Long id){
        preguntasService.deletePregunta(id);
        return ResponseEntity.noContent().build();
    }
}
