package Poo;

public class Perro {
    String nombre;
    String raza;
    String edad;


    public Perro(String nombre, String raza, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }


    public void ladrar() {
        System.out.println("guau guau");
    }
}
