package com.example.demo.dao;

import com.example.demo.entity.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// comunicacion con la base de datos
@Repository
public interface ContratoDao extends JpaRepository<Contrato, Long> {
}
