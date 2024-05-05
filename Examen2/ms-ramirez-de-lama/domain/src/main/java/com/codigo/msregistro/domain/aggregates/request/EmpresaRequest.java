package com.codigo.msregistro.domain.aggregates.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EmpresaRequest {
    private String nombre;
    private String direccion;
    private String telefono;
    // Agrega aquí los demás campos que necesites para la solicitud de empresa
}
