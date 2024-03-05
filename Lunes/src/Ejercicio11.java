import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Ingrese la cantidad de elementos");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numeros.add((int)(Math.random()* 100) + 1);
        }
        System.out.println(numeros);
        System.out.println("ingrese el valor a buscar");
        int buscar = sc.nextInt();
        Collections.sort(numeros);
        System.out.println(numeros);
        int index = Collections.binarySearch(numeros, buscar);
        System.out.println(index);
        if(index>=0)
        {
            System.out.println(numeros.get(index));
        }
        else {
            System.out.println("Valor no existe");
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);

        // linked list no tiene indices
        // array list usa indices

        // busqueda con bucle for
    }
}