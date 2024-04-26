package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Electronic")
@Getter
@Setter
public class Smartphone extends Electronic{
    private String ram;
    private String camera;
}
