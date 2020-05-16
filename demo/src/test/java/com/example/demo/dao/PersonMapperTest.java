package com.example.demo.dao;

import com.example.demo.dao.mappers.PersonMapper;
import com.example.demo.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void testAddPerson() {
        Person person = new Person(2, "test_again");
        personMapper.addPerson(person);

        Assert.assertEquals("test_again", personMapper.getPerson(2).getName());
    }
}
