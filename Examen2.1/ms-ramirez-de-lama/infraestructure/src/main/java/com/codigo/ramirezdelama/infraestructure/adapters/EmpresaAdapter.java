package com.codigo.ramirezdelama.infraestructure.adapters;


import com.codigo.ramirezdelama.domain.aggregates.constants.Constant;
import com.codigo.ramirezdelama.domain.aggregates.dto.EmpresaDTO;
import com.codigo.ramirezdelama.domain.aggregates.dto.SunatEmpresaDTO;
import com.codigo.ramirezdelama.domain.aggregates.request.EmpresaRequest;
import com.codigo.ramirezdelama.domain.port.out.EmpresaServiceOut;
import com.codigo.ramirezdelama.infraestructure.client.ClienteEmpresaSunat;
import com.codigo.ramirezdelama.infraestructure.dao.EmpresaRepository;
import com.codigo.ramirezdelama.infraestructure.entity.EmpresaEntity;
import com.codigo.ramirezdelama.infraestructure.mapper.EmpresaMapper;
import com.codigo.ramirezdelama.infraestructure.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaAdapter implements EmpresaServiceOut {
    @Autowired
    private EmpresaRepository empresaRepository;
    @Autowired
    private ClienteEmpresaSunat clienteSunat;
    @Autowired
    private RedisService redisService;

    @Value("${token.api}")
    private String tokenSunat;

    private EmpresaEntity getEntity(EmpresaRequest empresaRequest, boolean actualiza, Long id) {
        // Ejecutar servicio de la SUNAT
        SunatEmpresaDTO empresaDTO = getDatosSunat(empresaRequest.getNumDoc());

        EmpresaEntity entity = new EmpresaEntity();
        entity.setNumeroDocumento(empresaDTO.getNumeroDocumento());
        entity.setRazonSocial(empresaDTO.getRazonSocial());
        entity.setTipoDocumento(empresaDTO.getTipoDocumento());
        entity.setEstado(Constant.STATUS_ACTIVE);
        entity.setCondicion(empresaDTO.getCondicion());
        entity.setDireccion(empresaDTO.getDireccion());
        entity.setProvincia(empresaDTO.getProvincia());
        entity.setDireccion(empresaDTO.getDistrito());
        entity.setDepartamento(empresaDTO.getDepartamento());
        entity.setEsAgenteRetencion(empresaDTO.isEsAgenteRetencion());
        // Datos de auditoria
        if (actualiza) {
            entity.setId(id);
            entity.setUsuaModif(Constant.USU_ADMIN);
            entity.setDateModif(getTimestamp());
        } else {
            entity.setUsuaCrea(Constant.USU_ADMIN);
            entity.setDateCreate(getTimestamp());
        }

        return entity;
    }

    private SunatEmpresaDTO getDatosSunat(String numeroRuc) {
        String authorization = "Bearer " + tokenSunat;
        // Aquí debes llamar al cliente Feign para obtener los datos de la SUNAT
        // y mapear la respuesta a un objeto EmpresaDTO
        return clienteSunat.getInfoSunat(numeroRuc, authorization);
    }

    private Timestamp getTimestamp() {
        long currentTime = System.currentTimeMillis();
        return new Timestamp(currentTime);
    }

    @Override
    public EmpresaDTO createEmpresaOut(EmpresaRequest empresaRequest) {
        EmpresaEntity empresaEntity = getEntity(empresaRequest, false, null);
        EmpresaEntity empresaSaved = empresaRepository.save(empresaEntity);
        return EmpresaMapper.fromEntity(empresaSaved);
    }

    @Override
    public Optional<EmpresaDTO> findByIdOut(Long id) {
        return Optional.empty(); // Implementa la lógica para buscar una empresa por ID
    }

    @Override
    public List<EmpresaDTO> findAllOut() {
        return List.of(); // Implementa la lógica para obtener todas las empresas
    }

    @Override
    public EmpresaDTO updateEmpresaOut(Long id, EmpresaRequest empresaRequest) {
        return null; // Implementa la lógica para actualizar una empresa
    }

    @Override
    public EmpresaDTO deleteEmpresaOut(Long id) {
        return null; // Implementa la lógica para eliminar una empresa
    }
}
