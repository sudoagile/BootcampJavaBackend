package com.codigo.rodriguezmijahuanga.dao;

import com.codigo.rodriguezmijahuanga.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}
