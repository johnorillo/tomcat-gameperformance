package com.gameperformance.aws.awselasticbeanstalkexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
public class WelcomeController {
    @GetMapping
    public String graph() {
        return "Welcome to Game Performance Landing Page";
    }
}
