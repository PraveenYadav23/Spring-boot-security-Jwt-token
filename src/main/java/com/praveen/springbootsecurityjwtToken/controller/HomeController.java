package com.praveen.springbootsecurityjwtToken.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping({"/hello"})
    public String hello(){
        return "hello praveen";
    }
}
