package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    private Integer id;
    private String name;

    public Person() {

    }

    public Person(@JsonProperty("id") Integer id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
