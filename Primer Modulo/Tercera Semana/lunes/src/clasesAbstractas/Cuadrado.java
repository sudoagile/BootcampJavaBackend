package clasesAbstractas;

public class Cuadrado extends Figura {
    private float lado;

    public Cuadrado(String color, float lado) {
        super(color);
        this.lado = lado;
    }
    @Override
    public float area(){
        return  (float)Math.pow(lado,2);

    }
}
