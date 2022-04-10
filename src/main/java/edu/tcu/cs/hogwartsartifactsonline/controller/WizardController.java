package edu.tcu.cs.hogwartsartifactsonline.controller;

import edu.tcu.cs.hogwartsartifactsonline.domain.Wizard;
import edu.tcu.cs.hogwartsartifactsonline.domain.Result;
import edu.tcu.cs.hogwartsartifactsonline.domain.StatusCode;
import edu.tcu.cs.hogwartsartifactsonline.service.WizardService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wizards")
public class WizardController {

    private WizardService wizardService;

    public WizardController(WizardService wizardService) {
        this.wizardService = wizardService;
    }

    @GetMapping
    public Result findAll(){
        List<Wizard> all = wizardService.findAll();
        Result result = new Result(true, StatusCode.SUCCESS, "Find All Success", all);
        return result;
    }

    @GetMapping("/{wizardId}")
    public Result findById(@PathVariable Integer wizardId){
        return new Result(true, StatusCode.SUCCESS, "Find one Success", wizardService.findById(wizardId));
    }

    @PostMapping
    public Result save(@RequestBody Wizard newWizard){
        wizardService.save(newWizard);
        return new Result(true, StatusCode.SUCCESS, "Save Success");
    }

    @PutMapping("/{wizardId}")
    public Result update(@PathVariable Integer wizardId, @RequestBody Wizard updatedWizard){
        wizardService.update(wizardId, updatedWizard);
        return new Result(true, StatusCode.SUCCESS, "Update Success");
    }

    @DeleteMapping("/{wizardId}")
    public Result delete(@PathVariable Integer wizardId){
        wizardService.delete(wizardId);
        return new Result(true, StatusCode.SUCCESS, "Delete Success");
    }
}
