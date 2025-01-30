package com.codigo;

import java.util.*;

public class Ejercici10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese la cantidad de elementos");
        int n = sc.nextInt();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            numeros.add(rand.nextInt());
        }

        System.out.println(numeros);

        int max = Collections.max(numeros);
        System.out.println(max);

        //Buscar el máximo valor

        int max2 = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {

            if (max2 < numeros.get(i))
            {
                max2 = numeros.get(i);
            }
            
        }

        System.out.println(max2);

    }


}
