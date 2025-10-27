package com.sudoagile.eje_uvdbpkw4.controller;

import com.sudoagile.eje_uvdbpkw4.entity.UsuariosEntity;
import com.sudoagile.eje_uvdbpkw4.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/g4")
public class UsuariosController {

    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @PostMapping
    public ResponseEntity<UsuariosEntity> crear(@RequestBody UsuariosEntity entity) {
        UsuariosEntity usuariosEntity = usuariosService.crearUsuario(entity);
        return ResponseEntity.ok(usuariosEntity);
    }
}
