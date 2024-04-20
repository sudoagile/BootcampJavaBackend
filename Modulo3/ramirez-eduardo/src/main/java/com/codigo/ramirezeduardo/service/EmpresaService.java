package com.codigo.ramirezeduardo.service;

import com.codigo.ramirezeduardo.entity.EmpresaEntity;

import java.util.List;
import java.util.Optional;

public interface EmpresaService {

    EmpresaEntity crear(EmpresaEntity empresaEntity);

    Optional<EmpresaEntity> buscarPorId(Long id);

    List<EmpresaEntity> buscarTodos();

    EmpresaEntity actualizar(Long id, EmpresaEntity empresaEntity);

    EmpresaEntity eliminar(Long id);
}
