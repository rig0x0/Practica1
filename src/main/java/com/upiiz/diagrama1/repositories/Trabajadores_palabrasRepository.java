package com.upiiz.diagrama1.repositories;



import com.upiiz.diagrama1.models.RespuestasTrabajadores;
import com.upiiz.diagrama1.models.Trabajadores_palabras;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class Trabajadores_palabrasRepository {
    private List<Trabajadores_palabras> trabajadoresPalabras = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Trabajadores_palabras guardar(Trabajadores_palabras palabra){
        palabra.setId(id.incrementAndGet());
        trabajadoresPalabras.add(palabra);
        return palabra;
    }

    public List<Trabajadores_palabras> getTrabajadoresPalabras(){
        return trabajadoresPalabras;
    }

    public Trabajadores_palabras obtenerPalabraPorId(Long id){
        return trabajadoresPalabras.stream().filter(palabras -> palabras.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id){
        trabajadoresPalabras.removeIf(palabras -> palabras.getId().equals(id));
    }

    public Trabajadores_palabras actualizar(Trabajadores_palabras palabra){
        eliminar(palabra.getId());
        trabajadoresPalabras.add(palabra);
        return palabra;
    }

    public List<Trabajadores_palabras> getAllPalabrasDeRespuestaById(Integer respuesta_id){
        return trabajadoresPalabras.stream().filter(palabras -> palabras.getRespuestaTrabajadores_id().equals(respuesta_id)).toList();
    }

    public Trabajadores_palabras getPalabraByIdDeRespuestaById(Integer respuesta_id, Long id){
        List<Trabajadores_palabras> respuestaTrabajadorId = trabajadoresPalabras.stream().filter(palabras -> palabras.getRespuestaTrabajadores_id().equals(respuesta_id)).toList();
        return respuestaTrabajadorId.stream().filter(palabras -> palabras.getId().equals(id)).findFirst().orElse(null);
    }
}
