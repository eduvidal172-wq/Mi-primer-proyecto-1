/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int mayor = 0;
            int menor = 0;
            
            for (int i = 1; i <= 10; i++) {
                
                System.out.print("Ingrese el número " + i + ": ");
                numero = entrada.nextInt();
                
                if (i == 1) {
                    mayor = numero;
                    menor = numero;
                } else {
                    
                    if (numero > mayor) {
                        mayor = numero;
                    }
                    
                    if (numero < menor) {
                        menor = numero;
                    }
                }
            }
            
            System.out.println("\nNúmero mayor: " + mayor);
            System.out.println("Número menor: " + menor);
        }
    }
}