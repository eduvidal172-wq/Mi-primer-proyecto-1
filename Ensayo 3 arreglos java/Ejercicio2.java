/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class SumaPromedio {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] numeros = new double[10];
            double suma = 0;
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el número real #" + (i + 1) + ": ");
                numeros[i] = sc.nextDouble();
                suma += numeros[i];
            }
            
            double promedio = suma / numeros.length;
            
            System.out.println("\nSuma total: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}