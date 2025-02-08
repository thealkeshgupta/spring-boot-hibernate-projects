package com.alkeshgupta.springcoredemo.rest;

import com.alkeshgupta.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for dependency

    private Coach myCoach;

    // define a constructor with Qualifier for dependency injection
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach){
        System.out.println("In constructor : " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
