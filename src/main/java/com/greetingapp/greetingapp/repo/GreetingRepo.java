package com.greetingapp.greetingapp.repo;

import com.greetingapp.greetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepo extends JpaRepository<Greeting,Integer> {
}
