package com.example.demo.repositories;

import com.example.demo.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    Universite findByNomUniversite(String nomUniversite);
}
