package com.example.demo.repositories;

import com.example.demo.entities.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    // Al extender JpaRepository, ya hereda todos los CRUD básicos de base de datos
}
