package com.codigo.msregistro.domain.ports.out;

import com.codigo.msregistro.domain.aggregates.dto.PersonaDTO;

public interface PersonaServiceOut {

    // Método para manejar el caso en que se haya creado una persona exitosamente
    void personaCreadaOut(PersonaDTO personaDTO);

    // Método para manejar el caso en que no se encuentre la persona buscada
    void personaNoEncontradaOut(Long id);
}

