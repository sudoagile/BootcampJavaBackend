package com.codigo.rodriguezmijahuanga.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personas")
@Getter
@Setter
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoDoc;
    private String numDoc;
    private String mombres;
    private String apellidos;
    private int estado;
}
