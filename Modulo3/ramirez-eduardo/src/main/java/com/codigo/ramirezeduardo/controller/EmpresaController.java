package com.codigo.ramirezeduardo.controller;

import com.codigo.ramirezeduardo.entity.EmpresaEntity;
import com.codigo.ramirezeduardo.service.EmpresaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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
@RequestMapping("/examen/v1/empresa")
@AllArgsConstructor
@Tag(
        name = "API DE MANTENIMIENTO DE EMPRESAS",
        description = "Esta API contiene todos los puntos finales para realizar el mantenimiento de la entidad empresas"
)
public class EmpresaController {

    private final EmpresaService empresaService;

    @PostMapping("/crear")
    @Operation(summary = "Crear una nueva Empresa")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Empresa Creada Exitosamente",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = EmpresaEntity.class))})
    })
    public ResponseEntity<EmpresaEntity> crear(
            @Parameter(description = "Datos de la empresa a crear", required = true)
            @RequestBody EmpresaEntity empresaEntity) {
        return ResponseEntity.ok(empresaService.crear(empresaEntity));
    }

    @Operation(summary = "Buscar una Empresa por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Empresa Encontrada",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = EmpresaEntity.class))}),
            @ApiResponse(responseCode = "404", description = "Empresa no encontrada")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Optional<EmpresaEntity>> buscarPorId(
            @Parameter(description = "ID de la empresa a buscar", example = "1", required = true)
            @PathVariable Long id) {
        Optional<EmpresaEntity> empresa = empresaService.buscarPorId(id);
        if (empresa.isPresent()) {
            return ResponseEntity.ok(empresa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/todos")
    @Operation(summary = "Buscar todas las Empresas")
    @ApiResponse(responseCode = "200", description = "Empresas Encontradas",
            content = {@Content(mediaType = "application/json",
                    schema = @Schema(implementation = EmpresaEntity.class))})
    public ResponseEntity<List<EmpresaEntity>> buscarTodos() {
        return ResponseEntity.ok(empresaService.buscarTodos());
    }

    @PutMapping("/actualizar/{id}")
    @Operation(summary = "Actualizar una Empresa por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Empresa Actualizada Exitosamente",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = EmpresaEntity.class))}),
            @ApiResponse(responseCode = "404", description = "Empresa no encontrada")
    })
    public ResponseEntity<EmpresaEntity> actualizar(
            @Parameter(description = "ID de la empresa a actualizar", example = "1", required = true)
            @PathVariable Long id,
            @Parameter(description = "Datos actualizados de la empresa", required = true)
            @RequestBody EmpresaEntity empresaEntity) {
        EmpresaEntity empresaActualizada = empresaService.actualizar(id, empresaEntity);
        if (empresaActualizada != null) {
            return ResponseEntity.ok(empresaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar/{id}")
    @Operation(summary = "Eliminar una Empresa por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Empresa Eliminada Exitosamente",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = EmpresaEntity.class))}),
            @ApiResponse(responseCode = "404", description = "Empresa no encontrada")
    })
    public ResponseEntity<EmpresaEntity> eliminar(
            @Parameter(description = "ID de la empresa a eliminar", example = "1", required = true)
            @PathVariable Long id) {
        EmpresaEntity empresaEliminada = empresaService.eliminar(id);
        if (empresaEliminada != null) {
            return ResponseEntity.ok(empresaEliminada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
