package com.example.demo.dao;

import com.example.demo.dao.mappers.PersonMapper;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDao {

    @Autowired
    private PersonMapper personMapper;

    public void addPerson(Person person) {
        personMapper.addPerson(person);
    }

    public List<Person> getPersons() {
        return personMapper.getPersons();
    }

}
