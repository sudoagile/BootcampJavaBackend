import java.util.ArrayList;

public class TutorialArrays {

    public static void main(String[] args) {
        int[] valores = new int[5];
        int[] valores2 = {3, 2, 55, 12, 9};

        valores[2] = 1000;
        valores[0] = 203;

        // Imprimir un valor
        System.out.println(valores[3]);
        System.out.println(valores[2]);

        System.out.println(valores2[4]);

        int tamanio = valores.length;
        System.out.println(tamanio);

        // Declarar una lista
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Jose");
        nombres.add("Juan");
        nombres.add("Rene");

        nombres.remove("Jose");

        // Combinación de for con arrays
        System.out.println("Imprimiendo el array");
        for (int i = 0; i < valores2.length; i++) {
            System.out.println(valores2[i]);
        }
    }
}
