/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Ejercicio9 {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {

        double promedio = calcularPromedio(8, 7, 9);

        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante reprobo.");
        }
    }
}
