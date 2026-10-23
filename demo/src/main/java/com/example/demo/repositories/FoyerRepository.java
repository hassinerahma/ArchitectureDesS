package com.example.demo.repositories;

import com.example.demo.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    Foyer findByNomFoyer(String nomFoyer);
    List<Foyer> findByCapaciteFoyerGreaterThan(long capacite);
}
