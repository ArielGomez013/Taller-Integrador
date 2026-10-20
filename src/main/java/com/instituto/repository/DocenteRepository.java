package com.instituto.repository;

import com.instituto.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository
        extends JpaRepository<Docente, Long> {
}
