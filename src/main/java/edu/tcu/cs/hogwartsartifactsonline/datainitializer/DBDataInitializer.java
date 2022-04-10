package edu.tcu.cs.hogwartsartifactsonline.datainitializer;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private ArtifactDao artifactDao;

    public DBDataInitializer(ArtifactDao artifactDao) {
        this.artifactDao = artifactDao;
    }

    @Override
    public void run(String... args) throws Exception {
        Artifact a1 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("Magical artifact that will absorb light from light sources as well as return it");
        a1.setImageUrl("imageUrl");

        Artifact a2 = new Artifact();
        a2.setId("2250808601736515584");
        a2.setName("Big Wand");
        a2.setDescription("A big wand");
        a2.setImageUrl("imageUrl");

        Artifact a3 = new Artifact();
        a3.setId("3250808601736515584");
        a3.setName("Bigger wand");
        a3.setDescription("a bigger wand");
        a3.setImageUrl("imageUrl");

        Artifact a4 = new Artifact();
        a4.setId("4250808601736515584");
        a4.setName("the biggest wand");
        a4.setDescription("the biggest wand ever");
        a4.setImageUrl("imageUrl");

        artifactDao.save(a1);
        artifactDao.save(a2);
        artifactDao.save(a3);
        artifactDao.save(a4);

    }
}
