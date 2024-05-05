package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.EmpresaRequest;
import com.codigo.msregistro.domain.ports.in.EmpresaServiceIn;
import com.codigo.msregistro.domain.ports.out.EmpresaServiceOut;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codigo.msregistro.domain.impl")

@Component
@AllArgsConstructor
public class EmpresaServiceImpl implements EmpresaServiceIn {

    private final EmpresaServiceOut empresaServiceOut;

    @Override
    public EmpresaDTO crearEmpresaIn(EmpresaRequest empresaRequest) {
        return empresaServiceOut.crearEmpresaOut(empresaRequest);
    }

    @Override
    public Optional<EmpresaDTO> obtenerEmpresaIn(Long id) {
        return empresaServiceOut.obtenerEmpresaOut(id);
    }

    // Implementa otros métodos según sea necesario
}


