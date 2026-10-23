package com.example.demo.services;

import com.example.demo.Entities.Universite;
import java.util.List;

public interface IUniversiteService {

    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite u);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);
}
