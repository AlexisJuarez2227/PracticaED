package com.upchiapas.biblioteca.models;

public class Libro {
    private int id;
    private String nombre;
    private String categoria;
    public Libro(int id, String nombre, String categoria){
        this.nombre=nombre;
        this.categoria=categoria;
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }
}
