package com.example.GestionEmission.Services;

import com.example.GestionEmission.Models.Emission;
import com.example.GestionEmission.Repositorys.EmissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmissionService {
    @Autowired
    EmissionRepo emissionRepo;

    public List<Emission> getAllEmissio(){
        return  emissionRepo.findAll();
    }
    public Optional<Emission> getEmissionByID(Long id){
        return emissionRepo.findById(id);
    }
    public Emission CreateEmissio(Emission newEmission){
        return emissionRepo.save(newEmission);
    }
    public Emission UpdateEmission(Emission UpdatedEmission , Long id){
        Emission old = emissionRepo.findById(id).get();
        old.setDescription(UpdatedEmission.getDescription());
        old.setDuree(UpdatedEmission.getDuree());
        old.setTitre(UpdatedEmission.getTitre());
        old.setHoraire(UpdatedEmission.getHoraire());
        return emissionRepo.save(old);
    }
    public  void DeleteEmission(Long id ){
        emissionRepo.deleteById(id);
    }

}
