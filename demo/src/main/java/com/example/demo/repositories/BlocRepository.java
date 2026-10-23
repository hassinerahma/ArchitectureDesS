package com.example.demo.repositories;

import com.example.demo.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findByFoyerNomFoyer(String nomFoyer);
    List<Bloc> findByCapaciteBlocGreaterThanEqual(long capacite);
}
