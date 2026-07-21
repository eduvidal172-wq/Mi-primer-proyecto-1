/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[10];

        // Ingreso de datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = leer.nextInt();
        }

        // Mostrar los valores almacenados
        System.out.println("\nValores almacenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
