package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Greeting;
import com.greetingapp.greetingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GreetingService  {
    Greeting addGreeting(User user);
}
