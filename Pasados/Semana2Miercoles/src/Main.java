import clasesJava.Computadora;
import  clasesJava.Usuario;
import clasesJava.Calculadora;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "hola";
        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();

        user1.nombre = "George";
        user2.nombre = "Andres";

        user1.edad = 27;
        user2.edad = 34;

        user1.email = "gehœ@uc.cl";
        user2.email = "snf@tr.pe";

        //computadora
        Computadora computadora1 = new Computadora();

        computadora1.marcaProcesador = "Intel";
        computadora1.almacenamiento = 512;
        computadora1.ram = 8;
        computadora1.marcaComputadora = "Hp";

        //calculadora
        Calculadora calculadora = new Calculadora();
        float suma = calculadora.sumar(4,5);
        System.out.println(suma);
        float resta = calculadora.restar(4,5);
        System.out.println(resta);
        float producto = calculadora.multiplicar(4,5);
        System.out.println(producto);


    }
}