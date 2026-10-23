package com.example.demo.Entities;

import jakarta.persistence.*;

import lombok.*;
import java.util.List;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Reservation implements Serializable {
    @Id
    private String idReservation;
    private String anneeUniversitaire;

    private Boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;

    @ManyToOne
    private Chambre chambre;
}
