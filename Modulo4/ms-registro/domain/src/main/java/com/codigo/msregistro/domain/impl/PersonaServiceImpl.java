package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.request.PersonaRequest;
import com.codigo.msregistro.domain.ports.in.PersonaServiceIn;
import com.codigo.msregistro.domain.ports.out.PersonaServiceOut;
import com.codigo.msregistro.infraestructure.entity.PersonaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaServiceIn {

    private final PersonaServiceOut personaServiceOut;
    @Override
    public PersonaEntity crearPersonaIn(PersonaEntity personaRequest) {
        return personaServiceOut.crearPersonaOut(personaRequest);
    }

    @Override
    public Optional<PersonaEntity> obtenerPersonaIn(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PersonaEntity> obtenerTodosIn() {
        return List.of();
    }

    @Override
    public PersonaEntity actualizarpersonaIn(Long id, PersonaRequest personaRequest) {
        return null;
    }

    @Override
    public PersonaEntity deleteIn(Long id) {
        return null;
    }
}
