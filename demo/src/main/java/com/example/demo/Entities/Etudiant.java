package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;
    @ManyToMany(mappedBy="etudiants" , cascade=CascadeType.ALL ,fetch = FetchType.EAGER)
    private List<Reservation> reservations;


}


