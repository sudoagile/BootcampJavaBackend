package com.sudoagile.prografuncional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class PrografuncionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrografuncionalApplication.class, args);
        //FUNCIONAL
        //Lista de String
        List<String> lstMarcas =List.of ("Mazda", "Toyota", "Nissan", "Chevrolet","Jetour","Subaru","Tesla");
        //lstMarcas.forEach(marca -> System.out.println(marca)); //En vez de usar un for

        //streams

        List<String> marcasFiltradas = lstMarcas.stream()
                .filter(marca -> marca.startsWith("T"))
                .map(String::toUpperCase)
                .toList();

                 marcasFiltradas.forEach(System.out::println);

//        List<String> marcasFiltradas = new ArrayList<>();
//        for (String marca : lstMarcas) {
//            if (marca.startsWith("T")) {
//                marcasFiltradas.add(marca.toUpperCase());
//            }
//        }

//        for (String marca : marcasFiltradas) {
//            System.out.println(marca);
//        }
//        List<String> marcasFiltradas = new ArrayList<>();
//        for (int i = 0; i < lstMarcas.size(); i++) {
//            String marca = lstMarcas.get(i);
//            if (marca.startsWith("T")) {
//                marcasFiltradas.add(marca.toUpperCase());
//            }
//        }
//
//        for (int i = 0; i < marcasFiltradas.size(); i++) {
//            System.out.println(marcasFiltradas.get(i));
//        }

    }

}
