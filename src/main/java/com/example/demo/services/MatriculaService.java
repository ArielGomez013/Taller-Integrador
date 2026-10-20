package com.example.demo.services;

import com.example.demo.entities.Cuota;
import com.example.demo.entities.Matricula;
import com.example.demo.repositories.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Transactional
    public Matricula cambiarEstado(Long idMatricula, String nuevoEstado) {
        Matricula matricula = matriculaRepository.findById(idMatricula)
                .orElseThrow(() -> new RuntimeException("Matrícula no encontrada"));

        matricula.setEstado(nuevoEstado);

        // [RN22] Al cancelar una matrícula, sus cuotas sin pagos pasan automáticamente a ANULADA
        if ("CANCELADA".equals(nuevoEstado)) {
            if (matricula.getCuotas() != null) {
                for (Cuota cuota : matricula.getCuotas()) {
                    if (cuota.getPagos() == null || cuota.getPagos().isEmpty()) {
                        cuota.setEstado("ANULADA");
                    }
                }
            }
        }
        return matriculaRepository.save(matricula);
    }
}
