package com.codigo.msregistro.domain.aggregates.request;

import jakarta.persistence.Column;

public class PersonaRequest {
    @Column(name = "num_docu", nullable = false, length = 15)
    private String numDocu;

    @Column(name = "nombres", nullable = false, length = 150)
    private String nombres;

    @Column(name = "ape_pat", nullable = false, length = 150)
    private String apePat;

    @Column(name = "ape_mat", nullable = false, length = 150)
    private String apeMat;

}
