package com.alkeshgupta.springdemo1.springdemo1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "hello world"

    @GetMapping("/hello")
    public String sayHello(){
        return "hello world";
    }
}
