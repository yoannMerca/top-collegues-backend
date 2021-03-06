package dev.top.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dev.top.entities.Collegue;
import dev.top.entities.NewCollegue;
import dev.top.exception.TopCollegueException;

@Service
public class NewCollegueService<NewCollegueRepo> {

 
    public Collegue getNewCollegues(NewCollegue c) {
        final String uri = "https://tommy-sjava.cleverapps.io/collegues?matricule=" + c.getMatricule();
        RestTemplate restTemplate = new RestTemplate();
        NewCollegue[] result = restTemplate.getForObject(uri, NewCollegue[].class);
        Collegue newCol = new Collegue();
        if (result.length==0) {
            throw new TopCollegueException("le matricule saisi n'existe pas");
        }else{
            if (c.getPhoto()==null || c.getPhoto().isEmpty()){
                newCol.setPhoto(result[0].getPhoto());
            }else{
                newCol.setPhoto(c.getPhoto());
            }
            newCol.setPseudo(c.getNom());
            newCol.setScore(100);
           
            newCol.setEmail(result[0].getEmail());
            newCol.setPrenom(result[0].getPrenom());
        }
        return newCol;
    }
}
