package com.example.demo.Entities;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    private Bloc bloc;


    @OneToMany(cascade = CascadeType.ALL)   // pas de mappedBy
    @ToString.Exclude
    private List<Reservation> reservations;
}
