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
    private Coach anotherCoach;

    // define a constructor with Qualifier for dependency injection
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach, @Qualifier("baseballCoach") Coach theAnotherCoach){
        System.out.println("In constructor : " + getClass().getSimpleName());

        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans : myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }


}
