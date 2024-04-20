package org.example.examendemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "piloto")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "piloto_id")
    private int id;
    private String nombre;
    private String apellido;
    private boolean estado;
    @ManyToMany
    @JoinTable( name = "piloto_vuelo",
        joinColumns = @JoinColumn(name = "piloto_id_fk"),
        inverseJoinColumns = @JoinColumn(name = "vuelo_id_fk"))
    private Set<Vuelo> vuelos;
}
