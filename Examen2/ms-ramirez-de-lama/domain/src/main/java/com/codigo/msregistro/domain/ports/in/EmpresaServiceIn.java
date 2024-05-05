package com.codigo.msregistro.domain.ports.in;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.EmpresaRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@Component

public interface EmpresaServiceIn {

    EmpresaDTO crearEmpresaIn(EmpresaRequest requestEmpresa);

    Optional<EmpresaDTO> obtenerEmpresaIn(Long id);
}
