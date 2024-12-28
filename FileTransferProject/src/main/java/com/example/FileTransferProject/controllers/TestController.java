package com.example.FileTransferProject.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/")
    public String greet(
    ) {
        return("Welcome to the project");
    }

    @GetMapping("/secured")
    public String greetSecure(
    ) {
        return("Welcome to the secure project");
    }
}
