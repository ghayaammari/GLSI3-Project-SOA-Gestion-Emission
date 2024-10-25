package com.example.GestionEmission.Services;

import com.example.GestionEmission.Models.Personne;
import com.example.GestionEmission.Repositorys.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {
    @Autowired
    PersonneRepo personnerepo;

    public Optional<Personne> getPersonneByID(Long id ){
        return personnerepo.findById(id);
    }

    public List<Personne> getAllPersonne(){
        return personnerepo.findAll();

    }
    public  Personne Create(Personne newperson){
        return personnerepo.save(newperson);
    }
    public Personne UpdatePersonData(Personne upadtedPerson , Long id){
       Personne old = personnerepo.findById(id).get();
       old.setNom(upadtedPerson.getNom());
       old.setPrenom(upadtedPerson.getPrenom());
       return personnerepo.save(old);

    }
    public void  deletepersonbyid(Long id){
         personnerepo.deleteById(id);
    }


}
