package org.example.examendemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "aerolinea")
@Getter
@Setter
public class Aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aerolinea_id")
    private int id;
    private String nombre;
    private boolean estado;
    @OneToMany(mappedBy = "aerolinea")
    private Set<Avion> aviones;
}
