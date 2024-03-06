import java.util.Random;
import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        int suma = 0;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] % 3 != 0 && arreglo[i] % 5 != 0) {
                suma += arreglo[i];
            }
        }

        System.out.println("La suma de los elementos del arreglo excluyendo múltiplos de 3 y 5 es: " + suma);
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
