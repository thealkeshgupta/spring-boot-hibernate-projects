package com.alkeshgupta.springdemo1.springdemo1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for “teaminfo”

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach name: " + coachName + ", Team name : " + teamName;
    }


    // expose "/" that return "hello world"

    @GetMapping("/hello")
    public String sayHello(){
        return "hello world updated now";
    }

    // expose "/" that return "hello world"

    @GetMapping("/workout")
    public String returnWorkoutDistance(){
        return "ran 10 km today";
    }
}
