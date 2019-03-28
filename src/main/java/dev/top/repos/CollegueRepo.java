package dev.top.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.top.entities.Collegue;

@Repository
public interface CollegueRepo extends JpaRepository<Collegue, Integer> {

    Optional<Collegue> findByPseudo(String pseudo);
}