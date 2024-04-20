package com.codigo.ramirezeduardo.dao;

import com.codigo.ramirezeduardo.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {
}

