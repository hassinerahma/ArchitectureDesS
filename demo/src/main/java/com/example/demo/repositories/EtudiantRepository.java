package com.example.demo.repositories;

import com.example.demo.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Etudiant findByCin(long cin);
    List<Etudiant> findByNomEtAndPrenomEt(String nomEt, String prenomEt);
    List<Etudiant> findByEcoleIgnoreCase(String ecole);
}
