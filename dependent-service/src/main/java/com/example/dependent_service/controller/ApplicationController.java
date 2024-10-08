package com.example.dependent_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.logging.Logger;

@RestController
public class ApplicationController
{
    private  static final Logger log = Logger.getLogger(ApplicationController.class.getName());
    @GetMapping("/dependent-traces")
    public String helloTraces()
    {
        log.info("dependent-traces");
        introduceRandomDelay();
        return "Hello Traces";
    }


    public void introduceRandomDelay() {
        Random random = new Random();
        int delay = random.nextInt(1000); // Generate a random number between 0 and 999 milliseconds
        try {
            Thread.sleep(delay); // Introduce the delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Handle interrupted exception
        }
    }

}
