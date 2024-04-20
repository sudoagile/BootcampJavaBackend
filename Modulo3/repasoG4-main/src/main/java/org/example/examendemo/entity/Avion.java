package org.example.examendemo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "avion")
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avion_id")
    private int id;
    @Column(length = 120)
    private String modelo;
    @Column(name = "capacidad_pasajeros")
    private int capacidadPasajeros;
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "aerolinea_id_fk", nullable = false)
    private Aerolinea aerolinea;
}
