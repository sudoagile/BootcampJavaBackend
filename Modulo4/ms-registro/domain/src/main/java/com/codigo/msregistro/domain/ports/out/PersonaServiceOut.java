package com.codigo.msregistro.domain.ports.out;

import com.codigo.msregistro.domain.aggregates.request.PersonaRequest;
import com.codigo.msregistro.infraestructure.entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {
    PersonaEntity crearPersonaOut(PersonaEntity personaRequest);
    Optional<PersonaEntity> obtenerPersonaOut(Long id);
    List<PersonaEntity> obtenerTodosOut();
    PersonaEntity actualizarpersonaOut(Long id, PersonaRequest personaRequest);
    PersonaEntity deleteOut(Long id);
}
