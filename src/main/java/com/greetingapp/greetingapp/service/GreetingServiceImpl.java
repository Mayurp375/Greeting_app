package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Greeting;
import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.repo.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingServiceImpl implements GreetingService{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingRepo greetingRepository;
    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.getFirstName()+" "+user.getLastName());
        return greetingRepository.save(new Greeting((int) counter.incrementAndGet(),message));
    }
}
