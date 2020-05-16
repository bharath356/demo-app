package com.example.demo.controllers;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(("/service/personService"))
@RestController
public class PersonServiceController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getPersons() {
        return personService.getPersons();
    }

}
