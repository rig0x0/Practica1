package com.upiiz.diagrama1.models;

public class Stopwords {
    private Long id;
    private String termino;
    private boolean comparar;

    public Stopwords() {}

    public Stopwords(Long id, String termino, boolean comparar) {
        this.id = id;
        this.termino = termino;
        this.comparar = comparar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public boolean isComparar() {
        return comparar;
    }

    public void setComparar(boolean comparar) {
        this.comparar = comparar;
    }
}
