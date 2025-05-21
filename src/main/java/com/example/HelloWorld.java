package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @Autowired
    private User user;

    public void sayHello() {
        System.out.println("Hello World");

        System.out.println("Usuario: " + user.getName() + " " +
                user.getLastName() + ", Fecha de Nacimiento: " +
                user.getBirthDate());
    }
}
