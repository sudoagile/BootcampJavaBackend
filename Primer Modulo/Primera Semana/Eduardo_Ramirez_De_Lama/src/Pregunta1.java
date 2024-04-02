import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los primeros " + n + " números naturales excluyendo múltiplos de 3 y 5 es: " + suma);
    }
}
