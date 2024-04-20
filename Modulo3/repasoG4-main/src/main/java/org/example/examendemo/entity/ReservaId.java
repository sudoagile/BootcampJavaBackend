package org.example.examendemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ReservaId implements Serializable {
    @Column(name = "vuelo_id_fk")
    private int idVuelo;
    @Column(name = "pasajero_id_fk")
    private int pasajeroId;
}
