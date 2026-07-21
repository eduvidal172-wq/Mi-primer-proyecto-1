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

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese valor [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = leer.nextInt();
            }
        }

        System.out.println("Elementos de la diagonal principal:");

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {

                if (fila == columna) {
                    System.out.println(matriz[fila][columna]);
                    suma += matriz[fila][columna];
                }

            }
        }

        System.out.println("Suma de la diagonal principal: " + suma);
    }
}