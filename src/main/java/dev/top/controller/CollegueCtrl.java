package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.Collegue;
import dev.top.entities.NewCollegue;
import dev.top.services.CollegueService;
import dev.top.services.NewCollegueService;

@CrossOrigin
@RestController
@RequestMapping("/collegues")
public class CollegueCtrl{
    @Autowired
    private CollegueService collegueService;

    @Autowired
    private NewCollegueService newCollegueService;

    @GetMapping
    public List<Collegue> findAll() {
        return this.collegueService.findAll();
    }
    
    @PostMapping
    public void OutputFiltersertCollegue(@RequestBody NewCollegue collegue) {
      this.collegueService.save(this.newCollegueService.getNewCollegues(collegue)) ;
    }
    
    @PatchMapping("/{pseudo}")
    public Collegue voter(@PathVariable String pseudo, @RequestBody Vote vote) {
        return this.collegueService.voter(pseudo, vote.getAction());
    }
    
    @GetMapping("/")
    public Collegue findByPseudo(@RequestParam String pseudo) {
        return this.collegueService.findByPseudo(pseudo);
    }
}