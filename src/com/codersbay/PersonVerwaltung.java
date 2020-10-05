package com.codersbay;

import java.time.LocalDate;
import java.util.ArrayList;

public class PersonVerwaltung {

    public ArrayList<Person> persons = new ArrayList<>();

    public void createPerson(String surname, String name) {
        persons.add(new Person(surname, name));
    }

    public void createPerson(String surname, String name, Gender gender, LocalDate birth, Adresse adress) {
        persons.add(new Person(surname, name, gender, birth, adress));
    }

    public void createPerson(String surname, String name, Gender gender, LocalDate birth) {
        persons.add(new Person(surname, name, gender, birth));
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }


}
