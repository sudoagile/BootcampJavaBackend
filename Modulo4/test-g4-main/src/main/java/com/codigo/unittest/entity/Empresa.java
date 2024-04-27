package com.codigo.unittest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "empresa")
@Getter
@Setter
@NoArgsConstructor
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String razonSocial;
    private String tipoDocumento;
    private String numeroDocumento;
    private String condicion;
    private String direccion;
    private String distrito;
    private String provincia;
    private String departamento;
    private int estado;
    private boolean esAgenteRetencion;
    private String usuaCrea;
    private Timestamp dateCreate;
    private String usuaModif;
    private Timestamp dateModif;
    private String usuaDelet;
    private Timestamp dateDelet;

    public Empresa(Long id, String razonSocial, String tipoDocumento, String numeroDocumento, String condicion, String direccion, String distrito, String provincia, String departamento, int estado, boolean esAgenteRetencion, String usuaCrea, Timestamp dateCreate, String usuaModif, Timestamp dateModif, String usuaDelet, Timestamp dateDelet) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.condicion = condicion;
        this.direccion = direccion;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.estado = estado;
        this.esAgenteRetencion = esAgenteRetencion;
        this.usuaCrea = usuaCrea;
        this.dateCreate = dateCreate;
        this.usuaModif = usuaModif;
        this.dateModif = dateModif;
        this.usuaDelet = usuaDelet;
        this.dateDelet = dateDelet;
    }
}
