package com.codigo.msregistro.domain.ports.out;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.EmpresaRequest;

import java.util.Optional;

public interface EmpresaServiceOut {

    EmpresaDTO crearEmpresaOut(EmpresaRequest empresaDTO);

    Optional<EmpresaDTO> obtenerEmpresaOut(Long id);
}
