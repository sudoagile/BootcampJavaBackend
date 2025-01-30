package com.codigo;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Ingrese el valor");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i<10; i++) {
            suma += numeros[i];
        }
        System.out.println("Imprimiendo suma de sus elementos: "+ suma);

    }
}
