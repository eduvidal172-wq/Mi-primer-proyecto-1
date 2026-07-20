/*
 
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String nombre;
            int edad;
            String carrera;
            double estatura;
            
            System.out.println("=== REGISTRO DE DATOS PERSONALES ===");
            
            System.out.print("Ingrese su nombre: ");
            nombre = sc.nextLine();
            
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
            
            sc.nextLine(); // Limpia el salto de línea pendiente del buffer
            
            System.out.print("Ingrese su carrera: ");
            carrera = sc.nextLine();
            
            System.out.print("Ingrese su estatura (en metros, ej. 1.75): ");
            estatura = sc.nextDouble();
            
            System.out.println("\n=== DATOS INGRESADOS ===");
            System.out.println("Nombre   : " + nombre);
            System.out.println("Edad     : " + edad + " años");
            System.out.println("Carrera  : " + carrera);
            System.out.println("Estatura : " + estatura + " m");
        }
    }
}