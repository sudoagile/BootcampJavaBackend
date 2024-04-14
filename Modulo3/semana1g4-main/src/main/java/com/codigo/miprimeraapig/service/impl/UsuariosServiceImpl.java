package com.codigo.miprimeraapig.service.impl;

import com.codigo.miprimeraapig.entity.UsuariosEntity;
import com.codigo.miprimeraapig.repository.UsuariosRepository;
import com.codigo.miprimeraapig.service.UsuariosService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService {


    private final UsuariosRepository usuariosRepository;

    public UsuariosServiceImpl(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @Override
    public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity) {

        return usuariosRepository.save(usuariosEntity);
    }

    @Override
    public List<UsuariosEntity> getAllUsuarios() {
        return null;
    }

    @Override
    public UsuariosEntity buscarPorId(Integer id) {
        return usuariosRepository.findById(Long.valueOf(id)).get();
    }

    @Override
    public List<UsuariosEntity> buscarPorNombre(String nombres) {
        return null;
    }

    @Override
    public UsuariosEntity updateUsuario(Long id, UsuariosEntity request) {
        return null;
    }

    @Override
    public UsuariosEntity deleteUusuario(Long id) {
        return null;
    }
}
