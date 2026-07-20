/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int edad;
            
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
            
            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            }
        }
    }
}
