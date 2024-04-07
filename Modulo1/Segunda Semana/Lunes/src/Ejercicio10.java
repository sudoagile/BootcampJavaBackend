import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese la cantidad de elementos");
        int n = sc.nextInt();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numeros.add(random.nextInt());
        }

        System.out.println(numeros);

        int max = Collections.max(numeros);
        System.out.println(max);
    }
}