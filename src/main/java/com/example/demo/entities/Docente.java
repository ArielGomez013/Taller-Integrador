package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "docente")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docente")
    private Long idDocente;
    @Column(nullable = false, unique = true, length = 20)
    private String dni;
    @Column(nullable = false, length = 100)
    private String apellido;
    @Column(nullable = false, length = 100)
    private String nombre;
    private String email;
}