import java.util.Scanner;

public class Pregunta6 {
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

        // Ordenar el arreglo
        ordenarArreglo(arreglo);

        System.out.println("Arreglo ordenado de menor a mayor:");
        imprimirArreglo(arreglo);
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarArreglo(int[] arreglo) {
        int temp;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
    }
}
