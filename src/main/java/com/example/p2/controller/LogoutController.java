package com.example.p2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logout")
public class LogoutController {
    @RequestMapping
    public String get(){
        return "logout";
    }
}
