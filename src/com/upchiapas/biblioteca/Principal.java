package com.upchiapas.biblioteca;

import com.upchiapas.biblioteca.models.Biblioteca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String categoria;
        Scanner entrada = new Scanner(System.in);
        Biblioteca biblioteca=new Biblioteca();
        biblioteca.registrar();
        biblioteca.ordenar();
        System.out.println("Ingrese la categoria deseada");
        categoria=entrada.next();
        biblioteca.buscar(categoria);
    }
}
