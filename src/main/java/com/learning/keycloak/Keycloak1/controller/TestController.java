package com.learning.keycloak.Keycloak1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "API is working";
    }

    @GetMapping("/test2")
    public String test2(){
        return "API2 is working";
    }

}
