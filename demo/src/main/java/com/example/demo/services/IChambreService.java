package com.example.demo.services;


import com.example.demo.Entities.Chambre;
import org.springframework.stereotype.Service;
import java.util.List;

public interface IChambreService {

    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}
