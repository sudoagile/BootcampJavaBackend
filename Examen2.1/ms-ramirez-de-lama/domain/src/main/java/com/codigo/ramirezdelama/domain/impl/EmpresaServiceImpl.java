package com.codigo.ramirezdelama.domain.impl;

import com.codigo.ramirezdelama.domain.aggregates.dto.EmpresaDTO;
import com.codigo.ramirezdelama.domain.aggregates.request.EmpresaRequest;
import com.codigo.ramirezdelama.domain.port.in.EmpresaServiceIn;
import com.codigo.ramirezdelama.domain.port.out.EmpresaServiceOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaServiceIn {
    @Autowired
    private EmpresaServiceOut empresaServiceOut;
    @Override
    public EmpresaDTO createEmpresaIn(EmpresaRequest empresaRequest) {
        return empresaServiceOut.createEmpresaOut(empresaRequest);
    }

    @Override
    public Optional<EmpresaDTO> findByIdIn(Long id) {
        return empresaServiceOut.findByIdOut(id);
    }

    @Override
    public List<EmpresaDTO> findAllIn() {
        return empresaServiceOut.findAllOut();
    }

    @Override
    public EmpresaDTO updateEmpresaIn(Long id, EmpresaRequest empresaRequest) {
        return empresaServiceOut.updateEmpresaOut(id, empresaRequest);
    }

    @Override
    public EmpresaDTO deleteEmpresaIn(Long id) {
        return empresaServiceOut.deleteEmpresaOut(id);
    }
}
