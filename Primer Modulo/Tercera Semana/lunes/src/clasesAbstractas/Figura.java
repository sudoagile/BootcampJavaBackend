package clasesAbstractas;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract float area();
    public void printColor(){
        System.out.println("El color de la figura es: "+color);
    }

}
