package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Greeting;
import com.greetingapp.greetingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GreetingService extends JpaRepository<Greeting,Integer> {
    Greeting addGreeting(User user);

    Greeting fetchGreetingById(Long id);

    List<Greeting> getAllList();

    void deleteGreeting(Long id);

    Greeting updateGreeting(Long id, User user);
}
