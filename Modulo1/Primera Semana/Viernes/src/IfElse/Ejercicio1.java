package IfElse;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("El numero es par");


        }else{
            System.out.println("El numero es impar");
        }
        }


}
