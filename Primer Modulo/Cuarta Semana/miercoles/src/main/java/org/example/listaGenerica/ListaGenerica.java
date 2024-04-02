package org.example.listaGenerica;

import lombok.Getter;

import java.util.Arrays;

public class ListaGenerica<T> {
    private T[] elementos;
    @Getter
    private int tamanio;
    private int capacidadInicial = 10; // Cambié la capacidad inicial a 10

    public ListaGenerica() {
        this.elementos = (T[]) new Object[capacidadInicial];
        tamanio = 0;
    }

    public void add(T elemento) {
        asegurarCapacidad(); // Asegurar que hay suficiente capacidad antes de agregar
        elementos[tamanio] = elemento;
        tamanio++;
    }

    private void asegurarCapacidad() {
        if (tamanio == elementos.length) {
            int nuevaCapacidad = elementos.length * 2; // Duplicar la capacidad
            elementos = Arrays.copyOf(elementos, nuevaCapacidad);
        }
    }

    public T getItem(int index) {
        if (index < 0 || index >= tamanio) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return elementos[index];
    }
}

