package com.sudoagile.eje_uvdbpkw4.service.impl;

import com.sudoagile.eje_uvdbpkw4.entity.UsuariosEntity;
import com.sudoagile.eje_uvdbpkw4.repository.UsuariosRepository;
import com.sudoagile.eje_uvdbpkw4.service.UsuariosService;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    private final UsuariosRepository usuariosRepository;
    private static final Logger logger = LoggerFactory.getLogger(UsuariosServiceImpl.class); // Logger

    public UsuariosServiceImpl(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @Override
    @Transactional
    public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity) {
        logger.info("Intentando crear usuario: {}", usuariosEntity); // Log antes de guardar

        UsuariosEntity savedEntity = usuariosRepository.save(usuariosEntity);

        // Verificación: Recargar la entidad desde la base de datos
        UsuariosEntity retrievedEntity = usuariosRepository.findById(savedEntity.getId()).orElse(null);

        if (retrievedEntity != null) {
            logger.info("Usuario creado y verificado en la base de datos: {}", retrievedEntity);
            return retrievedEntity; // o savedEntity, dependiendo de si quieres devolver la versión recargada
        } else {
            logger.error("Error: Usuario no encontrado en la base de datos después de guardar.  ¡La transacción podría no estar funcionando!");
            throw new RuntimeException("Error al crear el usuario: no se pudo verificar el guardado."); // Lanza una excepción
        }
    }
}