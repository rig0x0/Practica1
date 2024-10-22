package com.upiiz.diagrama1.services;

import com.upiiz.diagrama1.models.Trabajadores;
import com.upiiz.diagrama1.repositories.TrabajadoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadoresService {
    TrabajadoresRepository trabajadoresRepository;

    public TrabajadoresService(TrabajadoresRepository trabajadoresRepository) {
        this.trabajadoresRepository = trabajadoresRepository;
    }

    public List<Trabajadores> getAllTrabajadores(){
        return trabajadoresRepository.getTrabajadores();
    }

    public Trabajadores getTrabajadorById(Long id){
        return trabajadoresRepository.obtenerTrabajadorPorId(id);
    }

    public Trabajadores guardarTrabajador(Trabajadores trabajador){
        return trabajadoresRepository.guardar(trabajador);
    }

    public Trabajadores updateTrabajador(Trabajadores trabajador){
        return trabajadoresRepository.actualizar(trabajador);
    }

    public void deleteTrabajador(Long id){
        trabajadoresRepository.eliminar(id);
    }
}
