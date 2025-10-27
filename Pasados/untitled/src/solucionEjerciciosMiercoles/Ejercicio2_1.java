package solucionEjerciciosMiercoles;
import java.util.Scanner;
public class Ejercicio2_1 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un número n:");
            int n = scanner.nextInt();

            System.out.println("Números pares menores a " + n + ":");

            // Iterar desde 0 hasta n (exclusivo) con un paso de 2
            for (int i = 0; i < n; i += 2) {
                System.out.println(i);
            }

            scanner.close();
        }


}
