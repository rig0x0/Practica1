package com.upiiz.diagrama1.services;

import com.upiiz.diagrama1.models.Preguntas;
import com.upiiz.diagrama1.repositories.PreguntasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntasService {
    PreguntasRepository preguntasRepository;

    public PreguntasService(PreguntasRepository preguntasRepository) {
        this.preguntasRepository = preguntasRepository;
    }

    public List<Preguntas> getAllPreguntas(){
        return preguntasRepository.getPreguntas();
    }

    public Preguntas getPreguntaById(Long id){
        return preguntasRepository.obtenerPreguntaPorId(id);
    }

    public Preguntas guardarPregunta(Preguntas pregunta){
        return preguntasRepository.guardar(pregunta);
    }

    public Preguntas updatePregunta(Preguntas pregunta){
        return preguntasRepository.actualizar(pregunta);
    }

    public void deletePregunta(Long id){
        preguntasRepository.eliminar(id);
    }
}
