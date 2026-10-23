package com.example.demo.Entities;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    private Set<Bloc> blocs;
}
