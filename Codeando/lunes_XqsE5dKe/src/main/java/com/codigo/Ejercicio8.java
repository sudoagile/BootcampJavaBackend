package com.codigo;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Ingrese el valor");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Imprimiendo de manera inversa");
        for (int i = 9; i >=0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
