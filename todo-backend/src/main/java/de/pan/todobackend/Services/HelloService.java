package de.pan.todobackend.Services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String Greeting() {
        return "Hello World!";
    }
}
