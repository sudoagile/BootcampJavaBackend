import java.util.ArrayList;
import java.util.Scanner;

public class Pregunta7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de días y el límite de deseos por página (separados por espacio):");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Ingrese la cantidad de deseos por día (separados por espacio):");
        ArrayList<Integer> deseosPorDia = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numDeseos = sc.nextInt();
            deseosPorDia.add(numDeseos);
        }

        for (int i = 0; i < n; i++) {
            int numDeseos = deseosPorDia.get(i);
            int paginasDia = (numDeseos + m - 1) / m;
            if (i > 0 && paginasDia == 1 && deseosPorDia.get(i) % m == 0) {
                paginasDia = 0;
            }
            System.out.print(paginasDia + " ");
        }
    }
}

