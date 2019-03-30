package dev.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.top.entities.Collegue;
import dev.top.entities.Version;
import dev.top.repos.CollegueRepo;
import dev.top.repos.VersionRepo;

@Component
public class StartupDataInit {

    @Autowired
    VersionRepo versionRepo;

    @Autowired
    CollegueRepo collegueRepo;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {

        this.versionRepo.save(new Version("v1"));
        this.versionRepo.save(new Version("v2"));
        this.versionRepo.save(new Version("v3"));
        this.versionRepo.save(new Version("v4 dffbsdfghs"));
        //String matricule, String nom, String prenom, String photo,String email 
        this.collegueRepo.save(new Collegue("yoann","mercadier","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/One_Direction_NRJ_2014_3.jpg/330px-One_Direction_NRJ_2014_3.jpg","yoann@plop.fr"));
        this.collegueRepo.save(new Collegue("youyou","handoura","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Harry_Styles_November_2014.jpg/330px-Harry_Styles_November_2014.jpg","youcef@plop.fr"));
        this.collegueRepo.save(new Collegue("yoyo2","merca","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/One_Direction_NRJ_2014_3.jpg/330px-One_Direction_NRJ_2014_3.jpg","yoyo@plop.fr"));
        this.collegueRepo.save(new Collegue("youyou2","handou","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Harry_Styles_November_2014.jpg/330px-Harry_Styles_November_2014.jpg","youyou@plop.fr"));
        this.collegueRepo.save(new Collegue("yoyo3","mer","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/One_Direction_NRJ_2014_3.jpg/330px-One_Direction_NRJ_2014_3.jpg","y@plop.fr"));
        this.collegueRepo.save(new Collegue("youyou3","ha","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Harry_Styles_November_2014.jpg/330px-Harry_Styles_November_2014.jpg","yy@plop.fr"));
    }
}
