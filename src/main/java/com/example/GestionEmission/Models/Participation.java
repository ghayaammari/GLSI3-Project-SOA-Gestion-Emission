package com.example.GestionEmission.Models;

import jakarta.persistence.*;

@Table
@Entity
public class Participation {
    @Id
    Long id;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    Personne personne;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    Emission emission;
    String role;

    public Participation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Emission getEmission() {
        return emission;
    }

    public void setEmission(Emission emission) {
        this.emission = emission;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Participation(Personne personne, Emission emission, String role) {
        this.personne = personne;
        this.emission = emission;
        this.role = role;
    }
}
