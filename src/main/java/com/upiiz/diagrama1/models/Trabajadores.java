package com.upiiz.diagrama1.models;

public class Trabajadores {
    private Long id;
    private String nombre;
    private Integer ocupacion_id;
    private Integer tiempo_trabajando;

    public Trabajadores(){}

    public Trabajadores(Long id, String nombre, Integer ocupacion_id, Integer tiempo_trabajando) {
        this.id = id;
        this.nombre = nombre;
        this.ocupacion_id = ocupacion_id;
        this.tiempo_trabajando = tiempo_trabajando;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOcupacion_id() {
        return ocupacion_id;
    }

    public void setOcupacion_id(Integer ocupacion_id) {
        this.ocupacion_id = ocupacion_id;
    }

    public Integer getTiempo_trabajando() {
        return tiempo_trabajando;
    }

    public void setTiempo_trabajando(Integer tiempo_trabajando) {
        this.tiempo_trabajando = tiempo_trabajando;
    }
}
