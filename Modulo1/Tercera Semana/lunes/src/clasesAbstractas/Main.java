package clasesAbstractas;

public class Main {

    public static void main(String[] args) {
        Cuadrado cuadraoo1 = new Cuadrado("Azul", 12);
        Circulo circulo1 = new Circulo("Rojo", 4);

        System.out.println(cuadraoo1.area());
        System.out.println(circulo1.area());

    }
}
