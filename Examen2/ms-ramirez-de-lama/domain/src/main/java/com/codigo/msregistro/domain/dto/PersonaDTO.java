package com.codigo.msregistro.domain.aggregates.dto;

import lombok.Data;

@Data
public class PersonaDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String tipoDocumento;
    private String numeroDocumento;
    private String email;
    private String telefono;
    private Integer estado;
    private String usuaCrea;
    private String usuaModif;
    private String usuaDelet;
}
