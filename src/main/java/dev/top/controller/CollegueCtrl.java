package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@RestController()
@RequestMapping("/collegues")
public class CollegueCtrl {

    @Autowired
    private CollegueRepo collectionRepo;

    @GetMapping
    public List<Collegue> findAll() {
        return this.collectionRepo.findAll();
    }

   @GetMapping("/{pseudo}")
    public Collegue findByPseudo(String pseudo) {
        return this.collectionRepo.findByPseudo(pseudo).orElseThrow( () -> new RuntimeException("plop"));
    } 
}