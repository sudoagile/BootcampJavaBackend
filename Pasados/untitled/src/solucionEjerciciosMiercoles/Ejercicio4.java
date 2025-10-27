package solucionEjerciciosMiercoles;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número n:");
        int n = scanner.nextInt();

        int suma = 0;


        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);

        scanner.close();
    }
}
