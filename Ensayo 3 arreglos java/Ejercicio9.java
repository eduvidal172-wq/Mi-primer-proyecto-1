/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int mayor, menor;

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Ingrese valor [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = leer.nextInt();
            }
        }

        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {

                if (matriz[fila][columna] > mayor) {
                    mayor = matriz[fila][columna];
                }

                if (matriz[fila][columna] < menor) {
                    menor = matriz[fila][columna];
                }

            }
        }

        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
    }
}