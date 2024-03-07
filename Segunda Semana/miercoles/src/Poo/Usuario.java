package Poo;

public class Usuario {
    // atributos
    String nombre;
    String apellido;
    int edad;
    String password;

    public Usuario(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

// metodos
    // login

    String login(String nombre, String password)
    {
        System.out.println("Logging de aplicativo");
        // logica de validacion
        String respuesta = "El usuario con el nombre " + nombre + "se logro autenticar";
        return respuesta;
    }
    void saludar()
    {
        System.out.println("Hola a todos");
    }
    void saludarPersona(String nombre)
    {
        System.out.println("Hola " + nombre);
    }
}