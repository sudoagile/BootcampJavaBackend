package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.dto.PersonaDTO;
import com.codigo.msregistro.domain.aggregates.request.PersonaRequest;
import com.codigo.msregistro.domain.ports.in.PersonaServiceIn;
import com.codigo.msregistro.domain.ports.out.PersonaServiceOut;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaServiceIn {

    private final PersonaServiceOut personaServiceOut;

    public PersonaServiceImpl(PersonaServiceOut personaServiceOut) {
        this.personaServiceOut = personaServiceOut;
    }

    @Override
    public PersonaDTO crearPersonaIn(PersonaRequest requestPersona) {
        // Lógica para crear una persona basada en la solicitud recibida
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setNombre(requestPersona.getNombre());
        personaDTO.setApellido(requestPersona.getApellido());
        personaDTO.setDireccion(requestPersona.getDireccion());
        // Agrega más lógica según sea necesario para crear la persona
        // Notifica al servicio de salida sobre la creación de la persona
        personaServiceOut.personaCreadaOut(personaDTO);
        return personaDTO;
    }

    @Override
    public Optional<PersonaDTO> obtenerPersonaIn(Long id) {
        // Lógica para obtener una persona por su ID
        // Este es solo un ejemplo básico, aquí deberías recuperar la persona de una base de datos u otro origen de datos
        // Notifica al servicio de salida si la persona no se encuentra
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setId(id);
        personaDTO.setNombre("Nombre de ejemplo");
        personaDTO.setApellido("Apellido de ejemplo");
        personaDTO.setDireccion("Dirección de ejemplo");
        personaServiceOut.personaNoEncontradaOut(id);
        return Optional.of(personaDTO);
    }
}
