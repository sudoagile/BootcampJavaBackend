package com.codigo.msregistro.application.controller;

import com.codigo.msregistro.domain.aggregates.dto.EmpresaDTO;
import com.codigo.msregistro.domain.aggregates.request.EmpresaRequest;
import com.codigo.msregistro.domain.ports.in.EmpresaServiceIn;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms-registro/v1/empresa")
@AllArgsConstructor
public class EmpresaController {

    private final EmpresaServiceIn empresaServiceIn;

    @PostMapping
    public ResponseEntity<EmpresaDTO> crearEmpresa(@RequestBody EmpresaRequest requestEmpresa){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(empresaServiceIn.crearEmpresaIn(requestEmpresa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpresaDTO> buscarEmpresaPorId(@PathVariable Long id){
        return empresaServiceIn.obtenerEmpresaIn(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<EmpresaDTO>> buscarTodasLasEmpresas(){
        // Implementa la lógica para obtener todas las empresas
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpresaDTO> actualizarEmpresa(@PathVariable Long id, @RequestBody EmpresaRequest requestEmpresa){
        // Implementa la lógica para actualizar una empresa
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EmpresaDTO> eliminarEmpresa(@PathVariable Long id){
        // Implementa la lógica para eliminar una empresa
        return ResponseEntity.notFound().build();
    }
}
