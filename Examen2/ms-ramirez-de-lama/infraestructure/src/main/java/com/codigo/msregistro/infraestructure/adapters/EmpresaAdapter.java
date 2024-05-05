package com.codigo.msregistro.infraestructure.adapters;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.EmpresaRequest;
import com.codigo.msregistro.infraestructure.entity.EmpresaEntity;
import com.codigo.msregistro.infraestructure.dao.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaAdapter {

    private final EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaAdapter(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public EmpresaDTO crearEmpresaIn(EmpresaRequest requestEmpresa) {
        EmpresaEntity empresaEntity = convertirRequestAEntity(requestEmpresa);
        empresaEntity = empresaRepository.save(empresaEntity);
        return convertirEntityADTO(empresaEntity);
    }

    public Optional<EmpresaDTO> obtenerEmpresaIn(Long id) {
        Optional<EmpresaEntity> empresaOptional = empresaRepository.findById(id);
        return empresaOptional.map(this::convertirEntityADTO);
    }

    private EmpresaEntity convertirRequestAEntity(EmpresaRequest requestEmpresa) {
        EmpresaEntity empresaEntity = new EmpresaEntity();
        empresaEntity.setNombre(requestEmpresa.getNombre());
        empresaEntity.setDireccion(requestEmpresa.getDireccion());
        empresaEntity.setTelefono(requestEmpresa.getTelefono());

        return empresaEntity;
    }

    private EmpresaDTO convertirEntityADTO(EmpresaEntity empresaEntity) {
        EmpresaDTO empresaDTO = new EmpresaDTO();
        empresaDTO.setId(empresaEntity.getId());
        empresaDTO.setNombre(empresaEntity.getNombre());
        empresaDTO.setDireccion(empresaEntity.getDireccion());
        empresaDTO.setTelefono(empresaEntity.getTelefono());

        return empresaDTO;
    }
}
