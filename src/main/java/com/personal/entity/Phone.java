package com.personal.entity;

/**
 * Created by Beauclair-Papix on 7/27/2015.
 */
public class Phone {

    private Long id;
    private String number;
    private Person person;

    public Phone() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
}
