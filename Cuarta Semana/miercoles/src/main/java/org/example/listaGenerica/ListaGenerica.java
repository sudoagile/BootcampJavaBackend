package org.example.listaGenerica;

public class ListaGenerica <T>{
    private T[] elementos;
    private int tamanio;
    private int capacidad_inicial = 10;

    public ListaGenerica() {
        this.elementos = (T[]) new Object[capacidad_inicial];
        int[] array = new int[4]; //otra forma

    }
}
