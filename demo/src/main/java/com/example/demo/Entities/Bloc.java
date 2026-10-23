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
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL )
    private Set<Chambre> chambres;
}
