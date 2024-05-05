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
        // Implementación para crear una persona en la base de datos
        // Utiliza el PersonaRepository para guardar la persona
        return null;
    }

    public Optional<PersonaDTO> obtenerPersonaIn(Long id) {
        // Implementación para obtener una persona de la base de datos por su ID
        // Utiliza el PersonaRepository para buscar la persona por su ID
        return Optional.empty();
    }

    @Override
    public void personaCreadaOut(PersonaDTO personaDTO) {
        // Implementación para manejar el caso en que se haya creado una persona exitosamente
    }

    @Override
    public void personaNoEncontradaOut(Long id) {
        // Implementación para manejar el caso en que no se encuentre la persona buscada
    }
}
