package com.example.GestionEmission.Controllers;

import com.example.GestionEmission.Models.Personne;
import com.example.GestionEmission.Services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonneController {
    @Autowired
    PersonneService personneService;
    @PostMapping("APIRest/Personne/add")
    public Personne CreateNewPerson(@RequestBody Personne personne){
        return personneService.Create(personne);
    }
    @GetMapping("APIRest/Personne/getall")
    public List<Personne> GetAllPersonne(){
        return personneService.getAllPersonne();
    }
    @GetMapping("APIRest/Personne/getByID/{idp}")
    public Optional<Personne> getPersonByID(@PathVariable Long idp ){
        return personneService.getPersonneByID(idp);
    }
    @PutMapping("APIRest/Personne/update/idp")
    public Personne updatePerson(@RequestBody Personne UpadetPerson , @PathVariable Long idp){
        Optional<Personne> person = personneService.getPersonneByID(idp);
        if(person.isEmpty()){
            return null;
        }else{
            return personneService.UpdatePersonData(UpadetPerson, idp);
        }
    }
    @DeleteMapping("APIRest/Personne/delete/{idp}")
    public boolean deleteperson(@PathVariable Long idp){
        Optional<Personne> personne = personneService.getPersonneByID(idp);
        if(personne.isEmpty()){
            return false;
        }else {
            personneService.deletepersonbyid(idp);
            return true;
        }
    }

}
