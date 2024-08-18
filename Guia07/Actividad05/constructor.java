/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad05;

/**
 *
 * @author User
 */
public class constructor {

    String nombre, genero, raza;
    int edad, peso;

    public constructor(String nombre, String genero, String raza, int edad, int peso) {
        this.nombre = nombre;
        this.genero = genero;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }

    public void mostrarDatos() {
        System.out.println("El nombre del pero es: " + nombre + "\nSu género es: " + genero + "\nSu raza es: " + raza + "\nSu edad es: " + edad +"año(s)"+ "\nSu peso es de: " + edad);
    }

}
