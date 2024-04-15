package com.codigo.persistencia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Entity
@Table(name = "Ventas")
@Getter
@Setter

public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    @OneToMany(mappedBy = "venta", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private Set<DetalleVenta> detalles;
}
