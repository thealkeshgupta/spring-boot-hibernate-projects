package com.alkeshgupta.springdemo1.springdemo1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
