package com.jee.hopital.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Wrapper type to support null values
    private String nom;
    private Date dateDeNaissance;
    private boolean malade;
    private int score;  // Float instead of float to match constructor
}
