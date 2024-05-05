package com.codigo.msregistro.domain.aggregates.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EmpresaDTO {
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    // Agrega aquí los demás campos que necesites para el DTO de empresa
}
