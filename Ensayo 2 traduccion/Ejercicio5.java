/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            double calificacion;
            
            System.out.print("Ingrese una calificación entre 0 y 10: ");
            calificacion = entrada.nextDouble();
            
            if (calificacion >= 9 && calificacion <= 10) {
                System.out.println("Excelente");
            } else if (calificacion >= 8) {
                System.out.println("Muy Bueno");
            } else if (calificacion >= 7) {
                System.out.println("Bueno");
            } else if (calificacion >= 5) {
                System.out.println("Regular");
            } else if (calificacion >= 0) {
                System.out.println("Deficiente");
            } else {
                System.out.println("Calificación no válida");
            }
        }
    }
}