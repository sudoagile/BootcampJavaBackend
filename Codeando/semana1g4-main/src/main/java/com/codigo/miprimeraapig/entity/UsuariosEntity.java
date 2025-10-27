package com.codigo.miprimeraapig.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsuariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nombre es requerido")
    private String nombres;
    @NotBlank(message = "Apellidos es requerido")
    private String apellidos;
    @Min(value = 1, message = "Valor minimo para mi usuario activado")
    private Integer estado;

}
