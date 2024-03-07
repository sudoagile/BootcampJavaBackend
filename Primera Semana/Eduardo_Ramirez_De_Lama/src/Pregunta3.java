import java.util.Scanner;

public class Pregunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es primo: ");
        int n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
