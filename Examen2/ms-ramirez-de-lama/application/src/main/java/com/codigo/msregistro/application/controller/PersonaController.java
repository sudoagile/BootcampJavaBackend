package com.codigo.msregistro.application.controller;

import com.codigo.msregistro.domain.aggregates.dto.PersonaDTO;
import com.codigo.msregistro.domain.aggregates.request.PersonaRequest;
import com.codigo.msregistro.domain.ports.in.PersonaServiceIn;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms-registro/v1/persona")
@AllArgsConstructor
public class PersonaController {

    private final PersonaServiceIn personaServiceIn;

    @PostMapping
    public ResponseEntity<PersonaDTO> crearPersona(@RequestBody PersonaRequest requestPersona){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.crearPersonaIn(requestPersona));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonaDTO> buscarPersonaPorId(@PathVariable Long id){
        return personaServiceIn.obtenerPersonaIn(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<PersonaDTO>> buscarTodasLasPersonas(){
        // Implementa la lógica para obtener todas las personas
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO> actualizarPersona(@PathVariable Long id, @RequestBody PersonaRequest requestPersona){
        // Implementa la lógica para actualizar una persona
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PersonaDTO> eliminarPersona(@PathVariable Long id){
        // Implementa la lógica para eliminar una persona
        return ResponseEntity.notFound().build();
    }
}
