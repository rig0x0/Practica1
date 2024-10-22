package com.upiiz.diagrama1.models;

public class RespuestasTrabajadores {
    private Long id;
    private String respuesta;
    private Integer pregunta_id;
    private Integer trabajador_id;

    public RespuestasTrabajadores(){}

    public RespuestasTrabajadores(Long id, String respuesta, Integer pregunta_id, Integer trabajador_id) {
        this.id = id;
        this.respuesta = respuesta;
        this.pregunta_id = pregunta_id;
        this.trabajador_id = trabajador_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Integer getPregunta_id() {
        return pregunta_id;
    }

    public void setPregunta_id(Integer pregunta_id) {
        this.pregunta_id = pregunta_id;
    }

    public Integer getTrabajador_id() {
        return trabajador_id;
    }

    public void setTrabajador_id(Integer trabajador_id) {
        this.trabajador_id = trabajador_id;
    }
}
