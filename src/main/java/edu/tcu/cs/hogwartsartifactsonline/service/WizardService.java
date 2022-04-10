package edu.tcu.cs.hogwartsartifactsonline.service;

import edu.tcu.cs.hogwartsartifactsonline.dao.WizardDao;
import edu.tcu.cs.hogwartsartifactsonline.utils.IdWorker;
import edu.tcu.cs.hogwartsartifactsonline.domain.Wizard;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WizardService {
    private WizardDao wizardDao;

    public WizardService(WizardDao wizardDao) {
        this.wizardDao = wizardDao;
    }

    public List<Wizard> findAll(){
        return wizardDao.findAll();
    }

    public Wizard findById(Integer wizardId) {
        return wizardDao.findById(wizardId).get();
    }

    public void save(Wizard newWizard) {
        wizardDao.save(newWizard);
    }

    public void update(Integer id, Wizard updatedWizard) {
        updatedWizard.setId(id);
        wizardDao.save(updatedWizard);
    }

    public void delete(Integer wizardId) {
        wizardDao.deleteById(wizardId);
    }
}
