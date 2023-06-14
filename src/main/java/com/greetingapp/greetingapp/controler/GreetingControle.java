package com.greetingapp.greetingapp.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingControle {

    @RequestMapping("/hellow")
    public String helloWorld(){
        return "<h1>Hellow world </h1>";
    }
}
