package Poo;

public class App {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.nombre = "George";
        usuario2.nombre = "Maria";

        usuario1.apellido = "Maxi";
        usuario2.apellido = "Maxi";

        usuario1.edad = 24;
        usuario2.edad = 20;

        String respuesta = usuario1.login("George", "1234");
        System.out.println(respuesta);
        usuario1.saludar();
        usuario1.saludarPersona("Jose Armando");
        String respuestaMetodo = usuario1.login("George", "123456");
        System.out.println(respuestaMetodo);

        
    }
}