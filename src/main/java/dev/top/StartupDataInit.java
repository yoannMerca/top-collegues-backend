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
        this.collegueRepo.save(new Collegue("yoyo","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/One_Direction_NRJ_2014_3.jpg/330px-One_Direction_NRJ_2014_3.jpg", 100));
        this.collegueRepo.save(new Collegue("youyou","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Harry_Styles_November_2014.jpg/330px-Harry_Styles_November_2014.jpg", 150));
        this.collegueRepo.save(new Collegue("yoyo2","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/One_Direction_NRJ_2014_3.jpg/330px-One_Direction_NRJ_2014_3.jpg",110));
        this.collegueRepo.save(new Collegue("youyou2","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Harry_Styles_November_2014.jpg/330px-Harry_Styles_November_2014.jpg",150));
        this.collegueRepo.save(new Collegue("yoyo3","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/One_Direction_NRJ_2014_3.jpg/330px-One_Direction_NRJ_2014_3.jpg", 100));
        this.collegueRepo.save(new Collegue("youyou3","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Harry_Styles_November_2014.jpg/330px-Harry_Styles_November_2014.jpg",150));
    }
}
