package com.upiiz.diagrama1.models;

public class Trabajadores_palabras {
    private Long id;
    private Integer respuestaTrabajadores_id;
    private Integer palabraClave_id;

    public Trabajadores_palabras() {}

    public Trabajadores_palabras(Long id, Integer respuestaTrabajadores_id, Integer palabraClave_id) {
        this.id = id;
        this.respuestaTrabajadores_id = respuestaTrabajadores_id;
        this.palabraClave_id = palabraClave_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRespuestaTrabajadores_id() {
        return respuestaTrabajadores_id;
    }

    public void setRespuestaTrabajadores_id(Integer respuestaTrabajadores_id) {
        this.respuestaTrabajadores_id = respuestaTrabajadores_id;
    }

    public Integer getPalabraClave_id() {
        return palabraClave_id;
    }

    public void setPalabraClave_id(Integer palabraClave_id) {
        this.palabraClave_id = palabraClave_id;
    }
}
