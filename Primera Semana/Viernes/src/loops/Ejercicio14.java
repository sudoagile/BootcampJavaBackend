package loops;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Minutos para leer: ");
        int tMinLeer = sc.nextInt();
        System.out.printf("Libros de la biblioteca: ");
        int libros = sc.nextInt();
        int[] tLectura = new int[libros];
        for (int i = 0; i < tLectura.length; i++) {
            System.out.printf("Tiempo de Lectura del libro " + (i + 1) + ": ");
            tLectura[i] = sc.nextInt();
        }
        int maxLibros = 0;
        for (int i = 0; i < tLectura.length; i++) {
            int maxLibrosI = 0;
            int aux = 0;
            for (int j = i; j < tLectura.length; j++) {
                if (tMinLeer >= tLectura[j]) {
                    aux += tLectura[j];
                    if (tMinLeer >= aux) {
                        maxLibrosI++;
                    }
                }
            }
            maxLibros = Math.max(maxLibrosI, maxLibros);
        }
        System.out.println("Mayor cantidad de libro a leer en " + tMinLeer + " min: " + maxLibros);
    }
}