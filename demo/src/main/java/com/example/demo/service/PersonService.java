package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    public List<Person> getPersons() {
        return personDao.getPersons();
    }
}
