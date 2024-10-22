package com.upiiz.diagrama1.services;

import com.upiiz.diagrama1.models.Trabajadores_palabras;
import com.upiiz.diagrama1.repositories.Trabajadores_palabrasRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class Trabajadores_palabrasService {
    Trabajadores_palabrasRepository trabajadoresPalabrasRepository;

    public Trabajadores_palabrasService(Trabajadores_palabrasRepository trabajadoresPalabrasRepository) {
        this.trabajadoresPalabrasRepository = trabajadoresPalabrasRepository;
    }

    public List<Trabajadores_palabras> getAllPalabras(){
        return trabajadoresPalabrasRepository.getTrabajadoresPalabras();
    }

    public Trabajadores_palabras getPalabraById(Long id){
        return trabajadoresPalabrasRepository.obtenerPalabraPorId(id);
    }

    public Trabajadores_palabras guardarPalabra(Trabajadores_palabras palabra){
        return trabajadoresPalabrasRepository.guardar(palabra);
    }

    public Trabajadores_palabras updatePalabra(Trabajadores_palabras palabra){
        return trabajadoresPalabrasRepository.actualizar(palabra);
    }

    public void deletePalabra(Long id){
        trabajadoresPalabrasRepository.eliminar(id);
    }

    public List<Trabajadores_palabras> getAllPalabrasPorRespuestaById(Integer respuesta_id){
        return trabajadoresPalabrasRepository.getAllPalabrasDeRespuestaById(respuesta_id);
    }

    public Trabajadores_palabras getPalabraByIdPorRespuestaId(Integer respuesta_id, Long id){
        return trabajadoresPalabrasRepository.getPalabraByIdDeRespuestaById(respuesta_id, id);
    }
}
