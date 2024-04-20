package com.codigo.rodriguezmijahuanga.controller;

import com.codigo.rodriguezmijahuanga.entity.PersonaEntity;
import com.codigo.rodriguezmijahuanga.service.PersonaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/examen/v1/persona")
@AllArgsConstructor
@Tag(
        name = "API DE MANTENIMIENTO PERSONAS",
        description = "Esta api contiene todos los end points para realizar el amntenimiento de la entidad personas"
)
public class PersonaController {

    private final PersonaService personaService;

    @PostMapping("/crear")
    @Operation(summary = "Crear una nueva Persona")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "200", description = "Persona Creada exitosamente",
                    content = { @Content(mediaType = "application/json",
                    schema = @Schema(implementation = PersonaEntity.class))})
    })
    public ResponseEntity<PersonaEntity> crear(@RequestBody PersonaEntity personaEntity){
        return ResponseEntity.ok(personaService.crear(personaEntity));
    }

    @Operation(summary = "uscar Una Persona Por ID")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "200", description = "Persona Encontrada",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = PersonaEntity.class))})
    })
    @GetMapping("/{id}")
    public ResponseEntity<Optional<PersonaEntity>> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(personaService.buscarPorId(id));
    }

    @GetMapping("/todos")
    public ResponseEntity<List<PersonaEntity>> buscarTodos(){
        return ResponseEntity.ok(personaService.buscarTodos());
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<PersonaEntity> actualizar(@PathVariable Long id, @RequestBody PersonaEntity personaEntity){
        return ResponseEntity.ok(personaService.actualizar(id,personaEntity));
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<PersonaEntity> eliminar(@PathVariable Long id){
        return ResponseEntity.ok(personaService.borrar(id));
    }

}
