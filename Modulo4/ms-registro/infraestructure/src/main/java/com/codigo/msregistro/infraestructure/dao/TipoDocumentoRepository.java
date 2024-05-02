package com.codigo.msregistro.infraestructure.dao;

import com.codigo.msregistro.infraestructure.entity.TipoDocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoRepository extends JpaRepository <TipoDocumentoEntity, Long>{
}
