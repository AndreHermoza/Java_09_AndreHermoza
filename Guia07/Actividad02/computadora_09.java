/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad02;

/**
 *
 * @author User
 */
public class computadora_09 {

    String sO, fabricante, programa, estado;
    int precio;

    public void ejecutarPgrm() {
        System.out.println("La computadora esta ejecutando: " + programa);

    }

    public void estado() {
        System.out.println("La pc está: " + estado);
    }

    public void mostarDatos() {
        System.out.println("La marca de la Laptop es : " + fabricante + "\nSu sistema operactivo es: " + sO + "\nSu precio es de: "+precio);
        ejecutarPgrm();
        estado();

    }

}
