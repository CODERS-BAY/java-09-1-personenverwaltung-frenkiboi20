package com.codersbay;

import java.time.LocalDate;

public class Person {

    public String surname, name;
    public Enum gender;
    public LocalDate birth;
    public Adresse adress;

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname, String name, Gender gender, LocalDate birth, Adresse adress) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.adress = adress;
    }

    public Person(String surname, String name, Gender gender, LocalDate birth) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }




}
