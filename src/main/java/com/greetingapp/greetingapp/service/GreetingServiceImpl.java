package com.greetingapp.greetingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greetingapp.greetingapp.entity.Greeting;
import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.repo.GreetingRepo;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingRepo greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template,
                (user.toString().isEmpty()) ? "Hello World" : user.getFirstName() + " " + user.getLastName());
        return greetingRepository.save(new Greeting((int) counter.incrementAndGet(), message));
    }

    @Override
    public Greeting fetchGreetingById(int id) {
        return greetingRepository.findById(id).get();
    }

    public List<Greeting> getList() {
        return greetingRepository.findAll();
    }

    public Greeting update(int id,User user){

        Greeting greeting = greetingRepository.findById(id).get();

        greeting.setMasage(String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.getFirstName()+" "+user.getLastName()));

        return greetingRepository.save(greeting);

    }

}
