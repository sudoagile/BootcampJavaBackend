package IfElse;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa nota de matematicas");
        int m = sc.nextInt();
        System.out.println("\"Ingresa nota de fisica");
        int f = sc.nextInt();
        System.out.println("\"Ingresa nota de quimica");
        int q = sc.nextInt();

        if (m >= 55 && f >= 55 && q >= 50) {
            System.out.println("Admitido");
        } else if (m + f >= 140) {
            System.out.println("Admitido");
        } else {
            System.out.println("No admitido");
        }
        sc.close();
    }
}