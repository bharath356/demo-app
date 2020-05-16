package com.example.demo.dao.mappers;

import com.example.demo.model.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {
    @Insert("INSERT INTO person(id, name) VALUES (#{id}, #{name})")
    void addPerson(Person person);

    @Select("SELECT id, name from person")
    List<Person> getPersons();

    @Select("SELECT id, name from person WHERE id = #{id}")
    Person getPerson(Integer id);

}
