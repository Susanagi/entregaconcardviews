package com.example.conociendobetania.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {

    private String nombre;
    private String contacto;
    private Integer foto;
    private Float valoracion;

    public MoldeHotel() {
    }

    public MoldeHotel(String nombre, String contacto, Integer foto, Float valoracion) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.foto = foto;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public Float getValoracion() {
        return valoracion;
    }

    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }
}
