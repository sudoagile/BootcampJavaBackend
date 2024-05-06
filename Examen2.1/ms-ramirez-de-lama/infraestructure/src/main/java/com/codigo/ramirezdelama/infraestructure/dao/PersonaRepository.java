package com.codigo.ramirezdelama.infraestructure.dao;

import com.codigo.ramirezdelama.infraestructure.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}
