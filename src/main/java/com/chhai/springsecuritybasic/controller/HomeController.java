package com.chhai.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/homepage")
    public String homepage(){
        return "This is the public homepage";
    }

    @GetMapping("/feed")
    public String feed(){
        return "This is the public feed";
    }
}

