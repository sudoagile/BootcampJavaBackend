package IfElse;

import java.util.Scanner;

    public class Ejercicio4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el valor de n:");
            int n = sc.nextInt();

            System.out.println("Ingrese el valor de m:");
            int m = sc.nextInt();

            if (n == m) {
                System.out.println("n es igual a m");
            } else {
                System.out.println("n no es igual a m");
            }

            sc.close();
        }


}


