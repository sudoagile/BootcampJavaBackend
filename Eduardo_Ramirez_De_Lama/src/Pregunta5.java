import java.util.Scanner;

public class Pregunta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");

        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Invertir el arreglo
        int[] arregloInvertido = invertirArreglo(arreglo);

        System.out.println("Arreglo invertido:");
        imprimirArreglo(arregloInvertido);
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static int[] invertirArreglo(int[] arreglo) {
        int[] arregloInvertido = new int[arreglo.length];
        int j = arreglo.length - 1;
        for (int i = 0; i < arreglo.length; i++) {
            arregloInvertido[j] = arreglo[i];
            j--;
        }
        return arregloInvertido;
    }
}
