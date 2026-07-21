/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero = 0;
            int contador = 0;
            int suma = 0;
            
            while (numero >= 0) {
                
                System.out.print("Ingrese un número positivo (negativo para terminar): ");
                numero = entrada.nextInt();
                
                if (numero >= 0) {
                    contador++;
                    suma += numero;
                }
            }
            
            System.out.println("\nRESULTADOS");
            System.out.println("Cantidad de números ingresados: " + contador);
            System.out.println("Suma total: " + suma);
        }
    }
}

