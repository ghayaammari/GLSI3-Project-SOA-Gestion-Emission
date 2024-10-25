package com.example.GestionEmission.Services;

import com.example.GestionEmission.Models.Participation;
import com.example.GestionEmission.Models.Personne;
import com.example.GestionEmission.Repositorys.ParticipationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipationService {
    @Autowired
    ParticipationRepo participationRepo;
    public Optional<Participation> getParticipationByID(Long id ){
        return participationRepo.findById(id);
    }

    public List<Participation> getAllParticipation(){
        return participationRepo.findAll();

    }
    public  Participation Create(Participation newperson){
        return participationRepo.save(newperson);
    }
    public Participation UpdatePartipentData(Participation upadtedParticipation , Long id){
        Participation old = participationRepo.findById(id).get();
        old.setEmission(upadtedParticipation.getEmission());
        old.setPersonne(upadtedParticipation.getPersonne());
        return participationRepo.save(old);

    }
    public void  deletepersonbyid(Long id){
        participationRepo.deleteById(id);
    }
}
