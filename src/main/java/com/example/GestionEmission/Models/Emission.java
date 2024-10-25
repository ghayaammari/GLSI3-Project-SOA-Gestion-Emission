package com.example.GestionEmission.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;

@Entity
@Table
public class Emission {
    public Emission() {
    }

    public Long getID_Emission() {
        return ID_Emission;
    }

    public void setID_Emission(Long ID_Emission) {
        this.ID_Emission = ID_Emission;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalTime getHoraire() {
        return Horaire;
    }

    public void setHoraire(LocalTime horaire) {
        Horaire = horaire;
    }

    public Duration getDuree() {
        return Duree;
    }

    public void setDuree(Duration duree) {
        Duree = duree;
    }

    public Emission( String titre, String description, LocalTime horaire, Duration duree) {
        Titre = titre;
        Description = description;
        Horaire = horaire;
        Duree = duree;
    }

    @Id
    @GeneratedValue
    Long ID_Emission ;
    String Titre ;
    String     Description ;
    LocalTime Horaire ;

    Duration Duree;

}
