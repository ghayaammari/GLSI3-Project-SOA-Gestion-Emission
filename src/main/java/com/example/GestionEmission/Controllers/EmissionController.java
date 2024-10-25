package com.example.GestionEmission.Controllers;

import com.example.GestionEmission.Models.Emission;
import com.example.GestionEmission.Repositorys.EmissionRepo;
import com.example.GestionEmission.Services.EmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmissionController {
    @Autowired
    EmissionService emissionService;

    @PostMapping("APIRest/Emission")
    public Emission createEmission(@RequestBody Emission newEmission){
        return emissionService.CreateEmissio(newEmission);
    }
    @GetMapping("APIRest/Emission/getall")
    public List<Emission> getAllEmission(){
        return emissionService.getAllEmissio();
    }
    @GetMapping("APIRest/Emission/getByID/{ide}")
    public Optional<Emission> getEmissionById(@PathVariable Long ide){
        return emissionService.getEmissionByID(ide);
    }
    @PutMapping("APIRest/Emission/update/{ide}")
    public  Emission UpdateEmissionData(@RequestBody Emission upadtedEmission , @PathVariable Long ide){
        Optional<Emission> old = emissionService.getEmissionByID(ide);
        if(old.isEmpty()){
            return null;
        }
        else{
            return emissionService.UpdateEmission(upadtedEmission,ide);
        }

    }
    @DeleteMapping("APIRest/Emission/delete/{ide}")
    public boolean deleteEmissio(@PathVariable Long ide){
        Optional<Emission> emission = emissionService.getEmissionByID(ide);
        if(emission.isEmpty()){
            return false;
        }else {
            emissionService.DeleteEmission(ide);
            return true;
        }
    }
}
