/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma = 0;

        // Ingreso de datos
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese valor [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = leer.nextInt();
            }
        }

        // Suma de elementos
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                suma += matriz[fila][columna];
            }
        }

        System.out.println("Suma total de los elementos: " + suma);
    }
}