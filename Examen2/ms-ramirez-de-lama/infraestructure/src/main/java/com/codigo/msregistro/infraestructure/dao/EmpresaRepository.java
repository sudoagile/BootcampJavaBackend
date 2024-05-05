package com.codigo.msregistro.infraestructure.dao;

import com.codigo.msregistro.infraestructure.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

}
