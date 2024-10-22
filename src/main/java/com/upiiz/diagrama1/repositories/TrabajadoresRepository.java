package com.upiiz.diagrama1.repositories;


import com.upiiz.diagrama1.models.Trabajadores;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TrabajadoresRepository {
    private List<Trabajadores> trabajadores = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public Trabajadores guardar(Trabajadores trabajador){
        trabajador.setId(id.incrementAndGet());
        trabajadores.add(trabajador);
        return trabajador;
    }

    public List<Trabajadores> getTrabajadores(){
        return trabajadores;
    }

    public Trabajadores obtenerTrabajadorPorId(Long id){
        return trabajadores.stream().filter(trabajadores -> trabajadores.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id){
        trabajadores.removeIf(trabajadores -> trabajadores.getId().equals(id));
    }

    public Trabajadores actualizar(Trabajadores trabajador){
        eliminar(trabajador.getId());
        trabajadores.add(trabajador);
        return trabajador;
    }
}
