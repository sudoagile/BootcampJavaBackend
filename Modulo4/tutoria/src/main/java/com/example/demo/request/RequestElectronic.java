package com.example.demo.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RequestElectronic {
    private Integer anio;
    private String brand;
    private Integer price;
    private String modelo;
    private String ram;
    private String camera;
}
