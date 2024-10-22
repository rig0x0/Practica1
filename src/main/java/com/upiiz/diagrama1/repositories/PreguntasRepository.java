package com.upiiz.diagrama1.repositories;

import com.upiiz.diagrama1.models.Preguntas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PreguntasRepository {
    private List<Preguntas> preguntas = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Preguntas guardar(Preguntas pregunta){
        pregunta.setId(id.incrementAndGet());
        preguntas.add(pregunta);
        return pregunta;
    }

    public List<Preguntas> getPreguntas(){
        return preguntas;
    }

    public Preguntas obtenerPreguntaPorId(Long id){
        return preguntas.stream().filter(preguntas -> preguntas.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id){
        preguntas.removeIf(preguntas -> preguntas.getId().equals(id));
    }

    public Preguntas actualizar(Preguntas pregunta){
        eliminar(pregunta.getId());
        preguntas.add(pregunta);
        return pregunta;
    }
}
