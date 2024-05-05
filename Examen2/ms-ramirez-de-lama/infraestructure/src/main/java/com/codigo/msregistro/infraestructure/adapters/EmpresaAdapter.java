package com.codigo.msregistro.infraestructure.adapters;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.EmpresaRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaAdapter {

    private final EmpresaDAO empresaDAO;

    @Autowired
    public EmpresaAdapter(EmpresaDAO empresaDAO) {
        this.empresaDAO = empresaDAO;
    }

    public EmpresaDTO crearEmpresaIn(EmpresaRequest requestEmpresa) {
        // Implementación para crear una empresa en la base de datos
        // Utiliza el EmpresaDAO para guardar la empresa
        return null;
    }

    public Optional<EmpresaDTO> obtenerEmpresaIn(Long id) {
        // Implementación para obtener una empresa de la base de datos por su ID
        // Utiliza el EmpresaDAO para buscar la empresa por su ID
        return Optional.empty();
    }
}
