package com.upiiz.diagrama1.models;

public class Preguntas {
    private Long id;
    private String pregunta;
    private Long tipo_id;

    public Preguntas(){}

    public Preguntas(Long id, String pregunta, Long tipo_id) {
        this.id = id;
        this.pregunta = pregunta;
        this.tipo_id = tipo_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Long getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(Long tipo_id) {
        this.tipo_id = tipo_id;
    }
}
