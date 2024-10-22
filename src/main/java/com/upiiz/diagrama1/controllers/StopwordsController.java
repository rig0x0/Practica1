package com.upiiz.diagrama1.controllers;

import com.upiiz.diagrama1.models.Preguntas;
import com.upiiz.diagrama1.models.Stopwords;
import com.upiiz.diagrama1.services.PreguntasService;
import com.upiiz.diagrama1.services.StopwordsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stopwords")
public class StopwordsController {
    StopwordsService stopwordsService;

    public StopwordsController(StopwordsService stopwordsService) {
        this.stopwordsService = stopwordsService;
    }

    @GetMapping
    public ResponseEntity<List<Stopwords>> getStopwords(){
        return ResponseEntity.ok(stopwordsService.getAllStopwords());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stopwords> getStopwordPorId(@PathVariable Long id){
        return ResponseEntity.ok(stopwordsService.getStopwordById(id));
    }

    @PostMapping
    public ResponseEntity<Stopwords> addStopword(@RequestBody Stopwords stopword){
        return ResponseEntity.ok(stopwordsService.guardarStopword(stopword));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stopwords> actualizarStopword(@RequestBody Stopwords stopword, @PathVariable Long id){
        stopword.setId(id);
        return ResponseEntity.ok(stopwordsService.updateStopword(stopword));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarStopword(@PathVariable Long id){
        stopwordsService.deleteStopword(id);
        return ResponseEntity.noContent().build();
    }
}
