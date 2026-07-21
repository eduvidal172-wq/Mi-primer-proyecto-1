/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */
public class Ejercicio11 {

    public static boolean esPar(int numero) {

        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        int numero = 10;

        if (esPar(numero)) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}