package com.example.Deploy.Environments.Variables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getDevNameAndAuthCode(){
        String authCode = environment.getProperty("myAuthCodeTree.authCode");
        String devName = environment.getProperty("myDevNameTree.devName");
        return "Authcode: " + authCode + " // " + " Developer name: " + devName;
    }
}
