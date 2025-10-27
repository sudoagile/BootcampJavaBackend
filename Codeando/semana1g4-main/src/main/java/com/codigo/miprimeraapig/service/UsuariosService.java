package com.codigo.miprimeraapig.service;

import com.codigo.miprimeraapig.entity.UsuariosEntity;

import java.util.List;

public interface UsuariosService {
    UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity);
    List<UsuariosEntity> getAllUsuarios();
    UsuariosEntity buscarPorId(Integer id);
    List<UsuariosEntity> buscarPorNombre(String nombres);
    UsuariosEntity updateUsuario(Long id, UsuariosEntity request);
    UsuariosEntity deleteUusuario(Long id);
}
