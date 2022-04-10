package edu.tcu.cs.hogwartsartifactsonline.controller;

import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.domain.User;
import edu.tcu.cs.hogwartsartifactsonline.domain.Result;
import edu.tcu.cs.hogwartsartifactsonline.domain.StatusCode;
import edu.tcu.cs.hogwartsartifactsonline.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Result findAll(){
        return new Result(true, StatusCode.SUCCESS, "Find All Success", userService.findAll());
    }

    @GetMapping("/{userId}")
    public Result findById(@PathVariable Integer userId){
        return new Result(true, StatusCode.SUCCESS, "Find one Success", userService.findById(userId));
    }

    @PostMapping
    public Result save(@RequestBody User newUser){
        userService.save(newUser);
        return new Result(true, StatusCode.SUCCESS, "Save Success");
    }

    @PutMapping("/{userId}")
    public Result update(@RequestBody User updatedUser, @PathVariable Integer userId){
        userService.update(userId, updatedUser);
        return new Result(true, StatusCode.SUCCESS, "Update Success");
    }

    @DeleteMapping("/{userId}")
    public Result delete(@PathVariable Integer userId){
        userService.delete(userId);
        return new Result(true, StatusCode.SUCCESS, "Delete Success");
    }
}
