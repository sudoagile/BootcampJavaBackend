package org.example.listaGenerica;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<Integer> lista1 = new ListaGenerica<>();
        lista1.add(1);

        System.out.println(lista1.getTamanio());
        lista1.add(39);
        System.out.println(lista1.getTamanio());

    }

}
