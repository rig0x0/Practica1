package com.upiiz.diagrama1.repositories;

import com.upiiz.diagrama1.models.RespuestasTrabajadores;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class RespuestasTrabajadoresRepository {
    private List<RespuestasTrabajadores> respuestas = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public RespuestasTrabajadores guardar(RespuestasTrabajadores respuesta){
        respuesta.setId(id.incrementAndGet());
        respuestas.add(respuesta);
        return respuesta;
    }

    public List<RespuestasTrabajadores> getRespuestas(){
        return respuestas;
    }

    public RespuestasTrabajadores obtenerRespuestaPorId(Long id){
        return respuestas.stream().filter(respuestas -> respuestas.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id){
        respuestas.removeIf(respuestas -> respuestas.getId().equals(id));
    }

    public RespuestasTrabajadores actualizar(RespuestasTrabajadores respuesta){
        eliminar(respuesta.getId());
        respuestas.add(respuesta);
        return respuesta;
    }

    public List<RespuestasTrabajadores> getAllRespuestasPorPreguntaById(Integer pregunta_id){
        return respuestas.stream().filter(respuestas -> respuestas.getPregunta_id().equals(pregunta_id)).toList();
    }

    public List<RespuestasTrabajadores> getAllRespuestasPorTrabajadorById(Integer trabajador_id){
        return respuestas.stream().filter(respuestas -> respuestas.getTrabajador_id().equals(trabajador_id)).toList();
    }

    public RespuestasTrabajadores getRespuestaByIdDeLaPreguntaById(Integer pregunta_id, Long id){
        List<RespuestasTrabajadores> respuestaPreguntaId = respuestas.stream().filter(respuestas -> respuestas.getPregunta_id().equals(pregunta_id)).toList();
        return respuestaPreguntaId.stream().filter(respuestas -> respuestas.getId().equals(id)).findFirst().orElse(null);
    }

    public RespuestasTrabajadores getRespuestaByIdPorTrabajadorId(Integer trabajador_id, Long id){
        List<RespuestasTrabajadores> respuestaTrabajadorId = respuestas.stream().filter(respuestas -> respuestas.getTrabajador_id().equals(trabajador_id)).toList();
        return respuestaTrabajadorId.stream().filter(respuestas -> respuestas.getId().equals(id)).findFirst().orElse(null);
    }
}
