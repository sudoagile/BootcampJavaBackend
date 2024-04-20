package org.example.examendemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reserva")
public class Reserva {
    @EmbeddedId
    private ReservaId reservaId;
}
