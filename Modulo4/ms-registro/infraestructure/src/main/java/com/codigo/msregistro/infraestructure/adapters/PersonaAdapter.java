package com.codigo.msregistro.infraestructure.adapters;


import com.codigo.msregistro.domain.aggregates.constantes.Constans;
import com.codigo.msregistro.domain.aggregates.request.PersonaRequest;
import com.codigo.msregistro.domain.ports.out.PersonaServiceOut;
import com.codigo.msregistro.infraestructure.dao.PersonaRepository;
import com.codigo.msregistro.infraestructure.entity.PersonaEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonaAdapter implements PersonaServiceOut {

    private final PersonaRepository personaRepository;

    @Override
    public PersonaEntity crearPersonaOut(PersonaRequest personaRequest) {
        PersonaEntity personaEntity = getPersonaCreate(personaRequest);
        return personaRepository.save(personaEntity);
    }

    private PersonaEntity getPersonaCreate(PersonaRequest personaRequest) {
        PersonaEntity entity = new PersonaEntity();
        entity.setNumDocu(personaRequest.getNumDocu());
        entity.setNombres(personaRequest.getNombres());
        entity.setApeMat(personaRequest.getApeMat());
        entity.setApePat(personaRequest.getApePat());
        entity.setEstado(Constans.STATUS_ATIVO);
        entity.setUsuaCrea(Constans.USU_ADMIN);
        entity.setDateCreate(getTimestamp());
        return entity;

    }

    private Timestamp getTimestamp(){
        long currentTime = System.currentTimeMillis();

        return new Timestamp(currentTime);
    }


    @Override
    public PersonaEntity crearPersonaOut(PersonaEntity personaRequest) {
        return null;
    }

    @Override
    public Optional<PersonaEntity> obtenerPersonaOut(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PersonaEntity> obtenerTodosOut() {
        return List.of();
    }

    @Override
    public PersonaEntity actualizarpersonaOut(Long id, PersonaRequest personaRequest) {
        return null;
    }

    @Override
    public PersonaEntity deleteOut(Long id) {
        return null;
    }
}
