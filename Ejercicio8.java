/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            String contraseña;
            
            do {
                System.out.print("Ingrese la contraseña: ");
                contraseña = entrada.nextLine();
            } while (!contraseña.equals("java2026"));
            
            System.out.println("Acceso concedido.");
        }
    }
}