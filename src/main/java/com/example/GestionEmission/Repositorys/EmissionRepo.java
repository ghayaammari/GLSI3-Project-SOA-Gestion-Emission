package com.example.GestionEmission.Repositorys;

import com.example.GestionEmission.Models.Emission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmissionRepo extends JpaRepository<Emission , Long > {
}
