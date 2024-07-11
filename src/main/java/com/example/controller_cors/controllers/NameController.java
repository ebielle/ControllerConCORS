package com.example.controller_cors.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @GetMapping("/name")
    public String myName(@PathVariable String name){
        return name;
    }
    @PostMapping("/name")
    public String reverseName(@PathVariable String name){
        StringBuilder reverseName = new StringBuilder(name);
        return reverseName.reverse().toString();
    }
}

