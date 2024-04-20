package org.example.examendemo.repository;

import org.example.examendemo.entity.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<Avion, Integer> {
}
