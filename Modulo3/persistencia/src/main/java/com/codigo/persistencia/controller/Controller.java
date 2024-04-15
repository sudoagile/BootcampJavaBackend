package com.codigo.persistencia.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/productos")

@AllArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @PostMapping("/crearProducto")
    public ResponseEntity<Producto> crearProducto(@RequestBody ProductoRequest request) {

        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre(request.getNombre());
        nuevoProducto.setPrecio(request.getPrecio());
        Producto productoGuardado = productoService.agregarProductoConCategorias(nuevoProducto, request.getCategoriasIds());

        return ResponseEntity.ok(productoGuardado);
    }

    }
}
