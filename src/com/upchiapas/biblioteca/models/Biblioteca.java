package com.upchiapas.biblioteca.models;

import java.util.Scanner;

public class Biblioteca {
    public Libro [] libros=new Libro[5];
    public Libro libro;
    public void registrar(){
        libro=new Libro(123,"principito","infantil");
        libros[0]=libro;
        libro=new Libro(124,"harry poter","fantacia");
        libros[1]=libro;
        libro=new Libro(126,"Java","aprendisaje");
        libros[2]=libro;
        libro=new Libro(125,"Matematicas","aprendisaje");
        libros[3]=libro;
        libro=new Libro(127,"Lectura","apredisaje");
        libros[4]=libro;
    }
    public void ordenar(){
        Libro aux;
        for (int i=0; i<5; i++)
            for (int j=i+1; j<5; j++)
                if(libros[i].getId()>libros[j].getId()){
                    aux=libros[i];
                    libros[i]=libros[j];
                    libros[j]=aux;
                }
    }
    public void visualisar(int i){
        System.out.println("El nombre del libro es: "+libros[i].getNombre());
        System.out.println("El id del libro es: "+libros[i].getId());
    }
    public void buscar(String categoria){
        for (int i=0; i<5; i++)
            if (libros[i].getCategoria().equals(categoria)){
                visualisar(i);
            }
    }
}
