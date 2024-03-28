package org.example.generics;

public class Point2D <E>{ //<E extends Number> Asi si se quiere q sea solo numero
    private E x;
    private E y;

    public Point2D(E x, E y) {
        this.x = x;
        this.y = y;
    }

    public E getX() {
        return x;
    }

    public E getY() {
        return y;
    }
}
