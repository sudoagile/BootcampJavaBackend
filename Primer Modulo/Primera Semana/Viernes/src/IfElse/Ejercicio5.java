package IfElse;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer número");
        int c = sc.nextInt();

        if (a>b && a>c)
        {
            System.out.println(a);
        } else if (b>a && b>c ) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
