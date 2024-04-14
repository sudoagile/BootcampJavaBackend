package com.codigo.miprimeraapig.repository;

import com.codigo.miprimeraapig.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Long> {

    List<UsuariosEntity> findByNombres(String nombres);

}
