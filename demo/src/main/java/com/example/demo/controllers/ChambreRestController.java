package com.example.demo.controllers;

import com.example.demo.Entities.Chambre;
import com.example.demo.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    @Autowired
    private IChambreService chambreService;

    //http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambre(){
        List<Chambre> listChambres=chambreService.retrieveAllChambres();
        return listChambres;

    }

    //http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.retrieveChambre(chId);
        return chambre;
    }

    //http://localhost:8089/tpfoyer/chambre/add-chambres
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
//http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }
//http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }

}
