package com.instituto.repository;

import com.instituto.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository
        extends JpaRepository<Alumno, Long> {
}
