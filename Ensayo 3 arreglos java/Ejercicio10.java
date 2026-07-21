/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int numero;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 5; columna++) {

                System.out.print("Ingrese valor [" + fila + "][" + columna + "]: ");
                numero = leer.nextInt();

                matriz[fila][columna] = numero + (fila * columna);
            }
        }

        System.out.println("\nMatriz resultante:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}