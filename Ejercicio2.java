/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num1, num2;
            int suma, resta, multiplicacion, residuo;
            double division;
            System.out.print("Ingrese el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = sc.nextInt();
            suma = num1 + num2;
            resta = num1 - num2;
            multiplicacion = num1 * num2;
            division = (double) num1 / num2;
            residuo = num1 % num2;
            System.out.println("\nRESULTADOS");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
            System.out.println("Residuo: " + residuo);
        }
    }
}
