package com.example.demo.repositories;

import com.example.demo.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
    List<Reservation> findByEstValideTrue();
    List<Reservation> findByEtudiantsCin(long cin);
}
