package com.codigo.msregistro.infraestructure.adapters;

import com.codigo.msregistro.domain.aggregates.dto.PersonaDTO;
import com.codigo.msregistro.domain.aggregates.request.PersonaRequest;
import com.codigo.msregistro.domain.ports.out.PersonaServiceOut;
import com.codigo.msregistro.infraestructure.dao.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaAdapter implements PersonaServiceOut {

    private final PersonaRepository personaRepository;

    public PersonaDTO crearPersonaIn(PersonaRequest requestPersona) {

        return null;
    }

    public Optional<PersonaDTO> obtenerPersonaIn(Long id) {

        return Optional.empty();
    }

    @Override
    public void personaCreadaOut(PersonaDTO personaDTO) {

    }

    @Override
    public void personaNoEncontradaOut(Long id) {

    }
}