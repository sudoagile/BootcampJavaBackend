package com.codigo.ramirezdelama.domain.port.out;

import com.codigo.ramirezdelama.domain.aggregates.dto.PersonaDTO;
import com.codigo.ramirezdelama.domain.aggregates.request.PersonaRequest;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {
    PersonaDTO createPersonaOut(PersonaRequest personaRequest);
    Optional<PersonaDTO> findByIdOut(Long id);
    List<PersonaDTO> findAllOut();
    PersonaDTO updatePersonaOut(Long id, PersonaRequest personaRequest);
    PersonaDTO deletePersonaOut(Long id);
}
