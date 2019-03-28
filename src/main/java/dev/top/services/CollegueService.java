package dev.top.services;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.top.controller.Avis;
import dev.top.entities.Collegue;
import dev.top.exception.TopCollegueException;
import dev.top.repos.CollegueRepo;

@Service
public class CollegueService {

    private CollegueRepo colRepo;

    public CollegueService(CollegueRepo collegueRepo) {
        this.colRepo = collegueRepo;
    }

    public List<Collegue> findAll() {
        return colRepo.findAll();
    }

    @Transactional
    public Collegue voter(String pseudo, Avis avis) {

        if (pseudo == null || avis == null) {
            throw new TopCollegueException("au moins un des paramètres n'est pas valorisé");
        }

        Collegue collegueTrouve = this.colRepo.findByPseudo(pseudo)
                .orElseThrow(() -> new TopCollegueException("pseudo inexistant"));

        Integer score = collegueTrouve.getScore();

        if (avis.equals(Avis.AIMER)) {
            collegueTrouve.setScore(score + 10);
        } else if (avis.equals(Avis.DETESTER)) {
            collegueTrouve.setScore(score - 10);
        }

        return collegueTrouve;

    }

}