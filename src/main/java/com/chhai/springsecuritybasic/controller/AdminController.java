package com.chhai.springsecuritybasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/homepage")
    public String adminHomePage(){
        return "This is the admin homepage";
    }

    @GetMapping("/feed")
    public String adminFeed(){
        return "This is the admin feed page";
    }
}
