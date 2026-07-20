/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            
            System.out.print("Ingrese un número entero: ");
            numero = entrada.nextInt();
            
            System.out.println("\nTabla de multiplicar del " + numero);
            
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}