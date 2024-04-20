package com.codigo.ramirezeduardo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "empresa")
@Getter
@Setter
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "razon_social", nullable = false)
    private String razonSocial;

    @Column(name = "tipo_documento", length = 1, nullable = false)
    private String tipoDocumento;

    @Column(name = "numero_documento", length = 11, nullable = false)
    private String numeroDocumento;

    @Column(name = "condicion", length = 10)
    private String condicion;

    @Column(name = "direccion", length = 255)
    private String direccion;

    @Column(name = "distrito", length = 255)
    private String distrito;

    @Column(name = "provincia", length = 255)
    private String provincia;

    @Column(name = "departamento", length = 255)
    private String departamento;

    @Column(name = "es_agente_retencion")
    private Boolean esAgenteRetencion;

    @Column(name = "estado")
    private Integer estado;

    @Column(name = "usua_crea", length = 50)
    private String usuaCrea;

    @Column(name = "date_create")
    private Timestamp dateCreate;

    @Column(name = "usua_modif", length = 50)
    private String usuaModif;

    @Column(name = "date_modif")
    private Timestamp dateModif;

    @Column(name = "usua_delet", length = 50)
    private String usuaDelet;

    @Column(name = "date_delet")
    private Timestamp dateDelet;
}
