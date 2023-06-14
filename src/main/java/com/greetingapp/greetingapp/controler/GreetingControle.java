package com.greetingapp.greetingapp.controler;

import com.greetingapp.greetingapp.entity.Greeting;
import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GreetingControle {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/hellow")
    public String helloWorld(){
        return "<h1>Hellow world </h1>";
    }

}
