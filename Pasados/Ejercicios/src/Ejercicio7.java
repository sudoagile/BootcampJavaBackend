public class Ejercicio7 {
    public static void main(String[] args) {
        for (int multiplicando = 1; multiplicando <= 10; multiplicando++) {
            System.out.println("Tabla de multiplicación del " + multiplicando + ":");
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                int resultado = multiplicando * multiplicador;
                System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
            }

            if (multiplicando < 10) {
                System.out.println("---------------------------------");
            }
        }
    }
}
