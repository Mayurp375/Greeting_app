package com.greetingapp.greetingapp.controler;

import com.greetingapp.greetingapp.entity.Greeting;
import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingControler {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/hellow")
    public String helloWorld() {
        return "<h1>Hellow world </h1>";
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "World")
                             String firstName, String lastName) {
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);

    }

    @GetMapping("/get/{id}")
    public Greeting fetchGreetingById(@PathVariable int id) {
        return greetingService.fetchGreetingById(id);
    }

    @GetMapping("/getAll")
    public List<Greeting> getAll() {
        return greetingService.getList();
    }
}
