package com.example.GestionEmission.Repositorys;

import com.example.GestionEmission.Models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepo extends JpaRepository<Personne , Long > {
}
