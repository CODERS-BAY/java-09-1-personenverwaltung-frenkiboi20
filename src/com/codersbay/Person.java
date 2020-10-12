package com.codersbay;

import java.time.LocalDate;

public class Person {

    public String surname;
    public String name;
    public Gender gender;
    public LocalDate birth;
    public Adresse postCode;

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname, String name, Gender gender, LocalDate birth, Adresse postCode) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.postCode = postCode;
    }

    public Person(String surname, String name, Gender gender, LocalDate birth) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }




}
