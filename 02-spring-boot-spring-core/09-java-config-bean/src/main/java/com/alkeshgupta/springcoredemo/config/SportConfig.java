package com.alkeshgupta.springcoredemo.config;

import com.alkeshgupta.springcoredemo.common.Coach;
import com.alkeshgupta.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
