package com.example.demo.services;

import com.example.demo.Entities.Chambre;
import com.example.demo.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    @Autowired  //le role est l'injection
    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }
    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();  // get() depuis optional<chambre> ===> j'ai Chambre<chambre> comme un forcage ded type de retour une chambre vide si rien n'existe
    }
    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }
    @Override
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

}
