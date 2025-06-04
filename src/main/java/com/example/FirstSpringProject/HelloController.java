package com.example.FirstSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello, World!";
    }
    @GetMapping("/")
    public String getHome() {
        return "Hello, Welcome Home !";
    }
}
