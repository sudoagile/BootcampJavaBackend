package com.codigo.msregistro.domain.ports.in;

import com.codigo.msregistro.domain.aggregates.dto.PersonaDTO;
import com.codigo.msregistro.domain.aggregates.request.PersonaRequest;

import java.util.Optional;

public interface PersonaServiceIn {

    PersonaDTO crearPersonaIn(PersonaRequest requestPersona);

    Optional<PersonaDTO> obtenerPersonaIn(Long id);
}
