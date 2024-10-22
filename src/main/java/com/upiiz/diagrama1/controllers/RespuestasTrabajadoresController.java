package com.upiiz.diagrama1.controllers;

import com.upiiz.diagrama1.models.RespuestasTrabajadores;
import com.upiiz.diagrama1.services.RespuestasTrabajadoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RespuestasTrabajadoresController {
    RespuestasTrabajadoresService respuestasTrabajadoresService;

    public RespuestasTrabajadoresController(RespuestasTrabajadoresService respuestasTrabajadoresService) {
        this.respuestasTrabajadoresService = respuestasTrabajadoresService;
    }

    @GetMapping("/respuestas")
    public ResponseEntity<List<RespuestasTrabajadores>> getRespuestas(){
        return ResponseEntity.ok(respuestasTrabajadoresService.getAllRespuestas());
    }

    @GetMapping("/respuestas/{id}")
    public ResponseEntity<RespuestasTrabajadores> getRespuestaPorId(@PathVariable Long id){
        return ResponseEntity.ok(respuestasTrabajadoresService.getRespuestaById(id));
    }

    @PostMapping("/trabajador/{trabajador_id}/pregunta/{pregunta_id}/respuestas")
    public ResponseEntity<RespuestasTrabajadores> addRespuesta(@RequestBody RespuestasTrabajadores respuesta, @PathVariable Integer pregunta_id, @PathVariable Integer trabajador_id){
        respuesta.setPregunta_id(pregunta_id);
        respuesta.setTrabajador_id(trabajador_id);
        return ResponseEntity.ok(respuestasTrabajadoresService.guardarRespuesta(respuesta));
    }

    @PutMapping("/trabajador/{trabajador_id}/pregunta/{pregunta_id}/respuestas/{id}")
    public ResponseEntity<RespuestasTrabajadores> actualizarRespuesta(@RequestBody RespuestasTrabajadores respuesta, @PathVariable Long id, @PathVariable Integer pregunta_id, @PathVariable Integer trabajador_id){
        respuesta.setId(id);
        respuesta.setTrabajador_id(trabajador_id);
        respuesta.setPregunta_id(pregunta_id);
        return ResponseEntity.ok(respuestasTrabajadoresService.updateRespuesta(respuesta));
    }

    @DeleteMapping("/respuestas/{id}")
    public ResponseEntity<Void> eliminarRespuesta(@PathVariable Long id){
        respuestasTrabajadoresService.deleteRespuesta(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/trabajador/{trabajador_id}/respuestas")
    public ResponseEntity<List<RespuestasTrabajadores>> obtenerAllRespuestasPorTrabajadorId(@PathVariable Integer trabajador_id){
        return ResponseEntity.ok(respuestasTrabajadoresService.getAllRespuestasPorTrabajador(trabajador_id));
    }

    @GetMapping("/pregunta/{pregunta_id}/respuestas")
    public ResponseEntity<List<RespuestasTrabajadores>> obtenerAllRespuestasPorPreguntaId(@PathVariable Integer pregunta_id){
        return ResponseEntity.ok(respuestasTrabajadoresService.getAllRespuestasPorPregunta(pregunta_id));
    }

    @GetMapping("/pregunta/{pregunta_id}/respuestas/{id}")
    public ResponseEntity<RespuestasTrabajadores> obtenerRespuestaIdDePreguntaId(@PathVariable Integer pregunta_id, @PathVariable Long id){
        return ResponseEntity.ok(respuestasTrabajadoresService.getRespuestaByIdPorPreguntaId(pregunta_id, id));
    }

    @GetMapping("/trabajador/{trabajador_id}/respuestas/{id}")
    public ResponseEntity<RespuestasTrabajadores> obtenerRespuestaIdDelTrabajadorId(@PathVariable Integer trabajador_id, @PathVariable Long id){
        return ResponseEntity.ok(respuestasTrabajadoresService.getRespuestaPorIdDelTrabajadorId(trabajador_id, id));
    }
}
