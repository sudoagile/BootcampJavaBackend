import java.util.Random;
import java.util.Scanner;

public class Pregunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 0;

        System.out.println("Número a adivinar: " + numeroAdivinar);
        System.out.println("Intenta adivinar el número entre 1 y 100");

        while (true) {
            intentos++;
            System.out.print("Intento #" + intentos + ": ");
            int intento = sc.nextInt();

            if (intento < numeroAdivinar) {
                System.out.println("El número es demasiado bajo");
            } else if (intento > numeroAdivinar) {
                System.out.println("El número es demasiado alto");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos");
                break;
            }
        }
    }
}
