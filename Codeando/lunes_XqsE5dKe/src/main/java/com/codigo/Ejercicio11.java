package com.codigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese la cantidad de elementos");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            numeros.add((int)(Math.random()* 100)+1);
        }
        System.out.println(numeros);
        System.out.println("Ingrese el valor a buscar");
        int buscar = sc.nextInt();
        Collections.sort(numeros);
        int index = Collections.binarySearch(numeros, buscar);
        System.out.println(numeros);
        System.out.println(index);
        if (index>=0) {
            System.out.println(numeros.get(index));
        }
        else {
            System.out.println("Valor no exixte");
        }
    }
}
