package org.example.examendemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AvionDto {
    private String modelo;
    private int capacidad;
    private boolean estado;
    private int idAerolinea;
}
