package com.example.GestionEmission.Repositorys;

import com.example.GestionEmission.Models.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipationRepo extends JpaRepository<Participation , Long> {
}
