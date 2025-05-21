package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class User {

    @Value("Pedro")
    private String name;

    @Value("Lopez")
    private String lastName;

    @Value("1990-05-15")
    private String dateOfBirthReal;

    private Date birthDate;

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // No setter para birthDate porque lo inicializamos en init()

    @PostConstruct
    public void init() {
        System.out.println("Init de User ejecutado");
        System.out.println("Valor inyectado: " + dateOfBirthReal);
        try {
            this.birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirthReal);
        } catch (Exception e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }
    }

}
