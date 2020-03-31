package com.tothenew.springbootrestfulday1assgn.Ques1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String Welcome() {
        return "Welcome to spring boot";
    }
}
