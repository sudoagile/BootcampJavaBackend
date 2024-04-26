package com.example.demo.dao;

import com.example.demo.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SmartphoneDao extends JpaRepository<Smartphone, Long> {
    Optional<Smartphone> findByModelo(String modelo);
}
