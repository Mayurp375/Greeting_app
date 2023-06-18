package com.greetingapp.greetingapp.repo;

import com.greetingapp.greetingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.greetingapp.greetingapp.entity.Greeting;

public interface GreetingRepo extends JpaRepository<Greeting, Integer> {

    Greeting save(Greeting greeting);

}
