import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese la cantidad de elementos:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de elementos debe ser mayor que cero.");
            return; // Salir del programa si la cantidad de elementos es inválida
        }

        System.out.println("Ingrese los " + n + " elementos uno por uno:");
        for (int i = 0; i < n; i++) {
            int elemento = sc.nextInt();
            numeros.add(elemento);
        }

        System.out.println("Los números ingresados son: " + numeros);

        int max = encontrarMaximo(numeros);
        System.out.println("El número máximo es: " + max);
    }

    public static int encontrarMaximo(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) {
            return Integer.MIN_VALUE; // Devolver el valor mínimo de Integer si la lista está vacía
        }

        int maximo = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > maximo) {
                maximo = numeros.get(i);
            }
        }
        return maximo;
    }
}
