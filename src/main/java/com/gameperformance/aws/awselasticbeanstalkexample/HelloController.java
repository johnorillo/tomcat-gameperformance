package com.gameperformance.aws.awselasticbeanstalkexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/graph")
@RestController
public class HelloController {

    @GetMapping
    public String graph() {
        return "Game Performance Graph New Commit april 7 ";
    }
}