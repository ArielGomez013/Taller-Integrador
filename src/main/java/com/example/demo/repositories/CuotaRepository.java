package com.example.demo.repositories;

import com.example.demo.entities.Cuota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CuotaRepository extends JpaRepository<Cuota, Long> {
    // Metodo personalizado para buscar cuotas por su estado (útil para [RN07])
    List<Cuota> findByEstado(String estado);
}
