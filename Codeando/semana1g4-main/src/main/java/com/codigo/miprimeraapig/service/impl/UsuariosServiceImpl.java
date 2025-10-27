package com.codigo.miprimeraapig.service.impl;

import com.codigo.miprimeraapig.entity.UsuariosEntity;
import com.codigo.miprimeraapig.repository.UsuariosRepository;
import com.codigo.miprimeraapig.service.UsuariosService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
           /* Optional<UsuariosEntity> before_entity = usuariosRepository.findById(id);
            if(before_entity.isPresent()){
                usuario.setId(id);
                if(usuario.getNombres()==null){
                    usuario.setNombres(before_entity.get().getNombres());
                }
                if(usuario.getApellidos()==null){
                    usuario.setApellidos(before_entity.get().getApellidos());
                }
                if(usuario.getEstado()==null){
                    usuario.setEstado(before_entity.get().getEstado());
                }
                return repository.save(usuario);
            }*/
            return null;
        }

    @Override
    public UsuariosEntity deleteUusuario(Long id) {
        return null;
    }
}
