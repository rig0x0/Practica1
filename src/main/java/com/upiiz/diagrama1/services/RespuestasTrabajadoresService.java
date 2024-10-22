package com.upiiz.diagrama1.services;

import com.upiiz.diagrama1.models.RespuestasTrabajadores;
import com.upiiz.diagrama1.repositories.RespuestasTrabajadoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestasTrabajadoresService {
    RespuestasTrabajadoresRepository respuestasTrabajadoresRepository;

    public RespuestasTrabajadoresService(RespuestasTrabajadoresRepository respuestasTrabajadoresRepository) {
        this.respuestasTrabajadoresRepository = respuestasTrabajadoresRepository;
    }

    public List<RespuestasTrabajadores> getAllRespuestas(){
        return respuestasTrabajadoresRepository.getRespuestas();
    }

    public RespuestasTrabajadores getRespuestaById(Long id){
        return respuestasTrabajadoresRepository.obtenerRespuestaPorId(id);
    }

    public RespuestasTrabajadores guardarRespuesta(RespuestasTrabajadores respuesta){
        return respuestasTrabajadoresRepository.guardar(respuesta);
    }

    public RespuestasTrabajadores updateRespuesta(RespuestasTrabajadores respuesta){
        return respuestasTrabajadoresRepository.actualizar(respuesta);
    }

    public void deleteRespuesta(Long id){
        respuestasTrabajadoresRepository.eliminar(id);
    }

    public List<RespuestasTrabajadores> getAllRespuestasPorPregunta(Integer pregunta_id){
        return respuestasTrabajadoresRepository.getAllRespuestasPorPreguntaById(pregunta_id);
    }

    public List<RespuestasTrabajadores> getAllRespuestasPorTrabajador(Integer trabajador_id){
        return respuestasTrabajadoresRepository.getAllRespuestasPorTrabajadorById(trabajador_id);
    }

    public RespuestasTrabajadores getRespuestaByIdPorPreguntaId(Integer pregunta_id, Long id){
        return respuestasTrabajadoresRepository.getRespuestaByIdDeLaPreguntaById(pregunta_id, id);
    }

    public RespuestasTrabajadores getRespuestaPorIdDelTrabajadorId(Integer trabajador_id, Long id){
        return respuestasTrabajadoresRepository.getRespuestaByIdPorTrabajadorId(trabajador_id, id);
    }
}
