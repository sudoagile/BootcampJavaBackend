package solucionEjerciciosMiercoles;

public class EjercicioAndOr {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        int num3 = 16;
        System.out.println("Ejemplo AND");
        System.out.println(num2>num1 && num1>num3);
        System.out.println(num2>num1 && num1<num3);

        System.out.println("Ejemplo OR");
        System.out.println(num2>num1 || num1>num3);
        System.out.println(num2>num1 || num1<num3);


    }
}
