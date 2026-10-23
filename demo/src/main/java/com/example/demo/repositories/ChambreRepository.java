package com.example.demo.repositories;

import com.example.demo.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findByTypeC(TypeChambre typeC);
    List<Chambre> findByBlocNomBloc(String nomBloc);
    Chambre findByNumeroChambre(long numeroChambre);
}
