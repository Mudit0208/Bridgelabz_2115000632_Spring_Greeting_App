package com.example.service;

import com.example.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {
    private final List<Greeting> greetings = new ArrayList<>();
    private Long currentId = 1L;

    public Greeting saveGreeting(Greeting greeting) {
        greeting.setId(currentId++);
        greetings.add(greeting);
        return greeting;
    }

    public List<Greeting> getAllGreetings() {
        return greetings;
    }
}
