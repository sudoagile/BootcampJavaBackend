package com.codigo.msregistro.domain.aggregates.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PersonaRequest {
    private String nombre;
    private String apellido;
    private String direccion;
    // Agrega aquí los demás campos que necesites para la solicitud de persona
}
