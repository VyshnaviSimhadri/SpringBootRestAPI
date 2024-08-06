package com.example.SpringBootRESTAPI.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello, Welcome. This is a REST API EndPoint From welcome()....!";
    }
    
    @GetMapping("/message")
    public String message() {
        return "This message from Message()....!";
    }

}
