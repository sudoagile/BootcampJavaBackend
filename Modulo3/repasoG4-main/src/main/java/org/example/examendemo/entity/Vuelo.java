package org.example.examendemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.examendemo.dto.AvionDto;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "vuelo")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vuelo_id")
    private int id;
    private Date fecha_salida;
    private Date fecha_llegada;
    private boolean estado;

    @ManyToOne
    @JoinColumn(name = "avion_id_fk")
    private Avion avion;
}
