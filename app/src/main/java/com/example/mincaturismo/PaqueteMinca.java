package com.example.mincaturismo;

import java.io.Serializable;

public class PaqueteMinca implements Serializable {

    String nombreTuristico,descripcion;
    int fotoSitio;

    public PaqueteMinca(String nombreTuristico,String descripcion, int fotoSitio){
        this.nombreTuristico = nombreTuristico;
        this.descripcion = descripcion;
        this.fotoSitio = fotoSitio;

    }

    public String getNombreTuristico() {
        return nombreTuristico;
    }

    public void setNombreTuristico(String nombreTuristico) {
        this.nombreTuristico = nombreTuristico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFotoSitio() {
        return fotoSitio;
    }

    public void setFotoSitio(int fotoSitio) {
        this.fotoSitio = fotoSitio;
    }
}
