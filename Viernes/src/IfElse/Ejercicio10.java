package IfElse;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio");
        int precio = sc.nextInt();
        System.out.println("\"Ingresa el peso");
        int peso = sc.nextInt();


        if (precio > 100 && peso > 10) {
            System.out.println("Premiun");
        } else if (precio > 100 && peso <= 10) {
            System.out.println("Normal");
        } else if (precio <= 100){
            System.out.println("Economico");
        }
        sc.close();
    }
}
