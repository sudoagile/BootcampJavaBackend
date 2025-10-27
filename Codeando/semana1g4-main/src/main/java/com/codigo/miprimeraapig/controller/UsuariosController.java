package com.codigo.miprimeraapig.controller;

import com.codigo.miprimeraapig.entity.UsuariosEntity;
import com.codigo.miprimeraapig.service.UsuariosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/g4")
public class UsuariosController {

   // private final UsuariosService usuariosService;
   @Qualifier("usuariosServiceImpl")
   @Autowired
   private UsuariosService usuariosService;

   @Qualifier("usuariosServiceImpl2")
   @Autowired
   private UsuariosService usuariosService2;

   /* /api/v1/g4/crearusuario */
    @PostMapping("/crearusuario")
    public ResponseEntity<UsuariosEntity> crear(@RequestBody UsuariosEntity entity){
        UsuariosEntity usuariosEntity = usuariosService.crearUsuario(entity);
        return ResponseEntity.ok(usuariosEntity);
    }
    @GetMapping("/todos")
    public ResponseEntity<List<UsuariosEntity>> getAll(){
        List<UsuariosEntity> usuariosEntity = usuariosService2.getAllUsuarios();
        return ResponseEntity.ok(usuariosEntity);
    }

    @GetMapping("/buscarxid/{id}")
    public ResponseEntity<UsuariosEntity> buscarxId(@PathVariable Integer id){
        UsuariosEntity usuario = usuariosService.buscarPorId(id);
        return ResponseEntity.ok(usuario);
    }

    //YO COMO USUARIO, QUIERO UN ENDPOINT QUE ME DEVUELVA LA LISTA DE USUARIOS QUE EXISTAN POR UN NOMBRE,
    // PARA PODER INDENTIFICAR A LOS USUARIOS MEDIANTE SU NOMBRE
    @GetMapping("/buscarxnombres/{nombres}")
    public ResponseEntity<List<UsuariosEntity>> buscarPorNombres(@PathVariable String nombres){
        List<UsuariosEntity> usuariosEntity = usuariosService.buscarPorNombre(nombres);
        return ResponseEntity.ok(usuariosEntity);
    }

    @PutMapping("/updateusuario/{id}")
    public ResponseEntity<UsuariosEntity> actualizar(@Valid @PathVariable Long id,
                                                     @RequestBody UsuariosEntity entity){
        UsuariosEntity usuariosEntity = usuariosService2.updateUsuario(id,entity);
        return ResponseEntity.ok(usuariosEntity);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<UsuariosEntity> delete(@PathVariable Long id){
        UsuariosEntity usuariosEntity = usuariosService2.deleteUusuario(id);
        return ResponseEntity.ok(usuariosEntity);
    }
}
