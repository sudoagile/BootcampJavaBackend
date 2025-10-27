package ClasesAbstractas;

public class Circulo extends Figura {
    private float radio;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public float area() {
        return (float) (Math.PI * radio * radio);
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * radio);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public void printColor() {
        System.out.println("El color del círculo es: " + getColor());
    }
}
