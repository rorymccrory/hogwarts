package edu.tcu.cs.hogwartsartifactsonline.datainitializer;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.dao.WizardDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.domain.User;
import edu.tcu.cs.hogwartsartifactsonline.domain.Wizard;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private ArtifactDao artifactDao;
    private WizardDao wizardDao;

    public DBDataInitializer(ArtifactDao artifactDao, WizardDao wizardDao) {
        this.artifactDao = artifactDao;
        this.wizardDao = wizardDao;
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

        Artifact a5 = new Artifact();
        a5.setId("5250808601736515584");
        a5.setName("Sword of Gryffindor");
        a5.setDescription("A goblin made sword adorned with large rubies on the pommel");
        a5.setImageUrl("imageUrl");

        Artifact a6 = new Artifact();
        a6.setId("6250808601736515584");
        a6.setName("Resurrection Stone");
        a6.setDescription("The Resurrection Stone allows the holder to bring back deceased");
        a6.setImageUrl("imageUrl");


        Wizard w1 = new Wizard();
        w1.setName("Albus Dumbledore");
        w1.addArtifact(a1);
        w1.addArtifact(a3);

        Wizard w2 = new Wizard();
        w2.setName("Harry Potter");
        w2.addArtifact(a2);
        w2.addArtifact(a4);

        Wizard w3 = new Wizard();
        w3.setName("Neville Longbottom");
        w3.addArtifact(a5);

        wizardDao.save(w1);
        wizardDao.save(w2);
        wizardDao.save(w3);
        //Since a6 doesn't have an owner yet, we need to save it explicitly here
        artifactDao.save(a6);

    }
}