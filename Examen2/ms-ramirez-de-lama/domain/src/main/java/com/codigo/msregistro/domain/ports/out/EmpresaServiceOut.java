package com.codigo.msregistro.domain.ports.out;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.EmpresaRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@Component


public interface EmpresaServiceOut {

    EmpresaDTO crearEmpresaOut(EmpresaRequest empresaRequest);

    Optional<EmpresaDTO> obtenerEmpresaOut(Long id);
}
