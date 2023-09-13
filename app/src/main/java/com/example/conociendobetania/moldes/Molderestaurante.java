package com.example.conociendobetania.moldes;

import java.io.Serializable;

public class Molderestaurante implements Serializable {

    private String nombre;
    private Integer foto;
    private String telefono;
    private String rangoprecio;
    private String platorecomendado;

    public Molderestaurante() {
    }

    public Molderestaurante(String nombre, Integer foto, String telefono, String rangoprecio, String platorecomendado) {
        this.nombre = nombre;
        this.foto = foto;
        this.telefono = telefono;
        this.rangoprecio = rangoprecio;
        this.platorecomendado = platorecomendado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoprecio() {
        return rangoprecio;
    }

    public void setRangoprecio(String rangoprecio) {
        this.rangoprecio = rangoprecio;
    }

    public String getPlatorecomendado() {
        return platorecomendado;
    }

    public void setPlatorecomendado(String platorecomendado) {
        this.platorecomendado = platorecomendado;
    }
}

