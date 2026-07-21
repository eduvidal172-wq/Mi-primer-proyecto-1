/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int suma = 0;
            double promedio;
            
            for (int i = 1; i <= 10; i++) {
                
                System.out.print("Ingrese el número " + i + ": ");
                numero = entrada.nextInt();
                
                suma += numero;
            }
            
            promedio = (double) suma / 10;
            
            System.out.println("\nSuma: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}