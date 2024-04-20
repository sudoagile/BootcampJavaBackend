package org.example.examendemo.repository;

import org.example.examendemo.entity.Aerolinea;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AerolineaRepository extends JpaRepository<Aerolinea, Integer> {
}
