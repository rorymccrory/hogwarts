package edu.tcu.cs.hogwartsartifactsonline.service;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ArtifactServiceTest {

    @Mock
    ArtifactDao artifactDao;
    @InjectMocks
    ArtifactService service;

    List<Artifact> list;

    @Test
    void findAll() {
        when(artifactDao.findAll()).thenReturn(list);
        assertEquals(2, service.findAll().size());
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @BeforeEach
    void setUp() {
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
        list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testFindAll() {
    }

    @Test
    void testFindById() {
    }

    @Test
    void testSave() {
    }

    @Test
    void testUpdate() {
    }

    @Test
    void testDelete() {
    }
}