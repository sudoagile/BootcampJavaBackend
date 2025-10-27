package solucionEjerciciosMiercoles;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        resolverOperaciones(numero);

        scanner.close();
    }

    public static void resolverOperaciones(int n) {
        System.out.println("Valor inicial: " + n);

        while (n != 1) {
            if (n % 2 == 1) {

                n = 3 * n + 1;
            } else {

                n = n / 2;
            }
            System.out.println("Nuevo valor: " + n);
        }
    }
}
