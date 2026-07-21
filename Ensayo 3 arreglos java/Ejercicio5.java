/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author [Complete aquí su nombre completo]
 */
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] numeros = new int[12];
        int numero;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número positivo: ");
            numero = leer.nextInt();

            numeros[i] = numero + i;
        }

        System.out.println("\nContenido del arreglo:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}

