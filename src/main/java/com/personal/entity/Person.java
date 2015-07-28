package com.personal.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Beauclair-Papix on 7/23/2015.
 */
public class Person {

    private Long id;
    private String firstName;
    private String lastName;
    private IdCard idCard;
    private Set<Phone> phones = new HashSet<Phone>();

    public  Person() {
    }

    public  Person(String firstN, String lastN) {
        this.firstName = firstN;
        this.lastName = lastN;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }
    public Set<Phone> getPhones() {
        return phones;
    }
    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

}
