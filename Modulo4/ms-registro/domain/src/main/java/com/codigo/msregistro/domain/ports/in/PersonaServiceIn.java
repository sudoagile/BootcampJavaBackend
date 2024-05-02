package com.codigo.msregistro.domain.ports.in;

import com.codigo.msregistro.domain.aggregates.request.PersonaRequest;
import com.codigo.msregistro.infraestructure.entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {

PersonaEntity crearPersonaIn(PersonaEntity personaRequest);
Optional<PersonaEntity> obtenerPersonaIn(Long id);
List<PersonaEntity> obtenerTodosIn();
PersonaEntity actualizarpersonaIn(Long id, PersonaRequest personaRequest);
PersonaEntity deleteIn(Long id);


}
