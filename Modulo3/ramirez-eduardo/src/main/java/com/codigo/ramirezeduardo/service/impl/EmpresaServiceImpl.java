package com.codigo.ramirezeduardo.service.impl;

import com.codigo.ramirezeduardo.entity.EmpresaEntity;
import com.codigo.ramirezeduardo.dao.EmpresaRepository;
import com.codigo.ramirezeduardo.service.EmpresaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaRepository empresaRepository;

    // Guardar una nueva Empresa en la Base de Datos
    @Override
    public EmpresaEntity crear(EmpresaEntity empresaEntity) {
        empresaEntity.setUsuaCrea("System");
        empresaEntity.setDateCreate(new Timestamp(System.currentTimeMillis()));

        // Validación adicional para garantizar que numeroDocumento no sea nulo
        String numeroDocumento = empresaEntity.getNumeroDocumento();
        if (numeroDocumento != null && !numeroDocumento.isEmpty()) {
            empresaEntity.setNumeroDocumento(numeroDocumento);
            return empresaRepository.save(empresaEntity);
        } else {
            throw new IllegalArgumentException("numeroDocumento no puede ser nulo o vacío");
        }
    }

    // Buscar una Empresa por su ID
    @Override
    public Optional<EmpresaEntity> buscarPorId(Long id) {
        return empresaRepository.findById(id);
    }

    // Buscar todas las Empresas registradas
    @Override
    public List<EmpresaEntity> buscarTodos() {
        return empresaRepository.findAll();
    }

    // Actualizar una Empresa existente
    @Override
    public EmpresaEntity actualizar(Long id, EmpresaEntity empresaEntity) {
        Optional<EmpresaEntity> empresaRecuperada = empresaRepository.findById(id);
        if (empresaRecuperada.isPresent()) {
            EmpresaEntity empresa = empresaRecuperada.get();
            empresa.setRazonSocial(empresaEntity.getRazonSocial());
            empresa.setTipoDocumento(empresaEntity.getTipoDocumento());
            // Validación adicional para garantizar que numeroDocumento no sea nulo
            String numeroDocumento = empresaEntity.getNumeroDocumento();
            if (numeroDocumento != null && !numeroDocumento.isEmpty()) {
                empresa.setNumeroDocumento(numeroDocumento);
            } else {
                // Trata el caso cuando numeroDocumento es nulo o vacío
                throw new IllegalArgumentException("numeroDocumento no puede ser nulo o vacío");
            }
            empresa.setCondicion(empresaEntity.getCondicion());
            empresa.setDireccion(empresaEntity.getDireccion());
            empresa.setDistrito(empresaEntity.getDistrito());
            empresa.setProvincia(empresaEntity.getProvincia());
            empresa.setDepartamento(empresaEntity.getDepartamento());
            empresa.setEsAgenteRetencion(empresaEntity.getEsAgenteRetencion());
            empresa.setUsuaModif("System");
            empresa.setDateModif(new Timestamp(System.currentTimeMillis()));
            return empresaRepository.save(empresa);
        }
        return null;
    }

    // Eliminar una Empresa de manera lógica (cambiando su estado)
    @Override
    public EmpresaEntity eliminar(Long id) {
        Optional<EmpresaEntity> empresaRecuperada = empresaRepository.findById(id);
        if (empresaRecuperada.isPresent()) {
            EmpresaEntity empresa = empresaRecuperada.get();
            empresa.setEstado(0); // Reemplaza 0 con el valor que corresponda a inactivo en tu caso
            empresa.setUsuaDelet("System");
            empresa.setDateDelet(new Timestamp(System.currentTimeMillis()));
            return empresaRepository.save(empresa);
        }
        return null;
    }
}
