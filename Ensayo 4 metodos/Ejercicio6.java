/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author Eduardo Vidal
 */
public class Ejercicio6 {

    public static int obtenerNumero() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {

        int numero = obtenerNumero();

        System.out.println("Numero aleatorio: " + numero);
    }
}