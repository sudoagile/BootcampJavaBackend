public class Ejercicio9 {
    public static void main(String[] args) {

        int[] arreglo = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};


        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }


        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
