package com.ashwin.project1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/")
    public String Greetings(){
        return("Hello World!!");
    }
    @RequestMapping("/home")
    public String home(){
        return("Helooo....!!");
    }
    @RequestMapping("/main")
    public String main(){
        return("Working Good!");
    }
}
