import java.util.Random;

public class Ejercicio9_1 {

    public static void main(String[] args) {
        // Declarar un arreglo de 10 elementos
        int[] arreglo = new int[10];

        // Generar números aleatorios y almacenarlos en el arreglo
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(100); // Genera números aleatorios entre 0 y 99
        }

        // Calcular la suma de los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        // Imprimir el arreglo
        System.out.println("Arreglo generado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Nueva línea

        // Imprimir la suma
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
