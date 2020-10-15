package com.codersbay;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonVerwaltungTest {

    private PersonVerwaltung pv;
    private Person jakob;
    private Person simone;
    private Person mia;
    private Person nico;
    private Person ines;

    @Test
    public void testReturnMessageIfListIsEmpty() {

        PersonVerwaltung pv = new PersonVerwaltung();
        assertEquals(pv.persons.size(), 0);

    }

    @Test
    public void testEmptyPersonManagement() {
        PersonVerwaltung pv = new PersonVerwaltung();
        assertEquals(true, pv.persons.isEmpty());
    }

    @Test
    public void testAddingPersons() {
        PersonVerwaltung pv = new PersonVerwaltung();
        pv.createPerson("Max", "Moritz", Gender.MALE, LocalDate.now(), new Adresse(4651, "Stadl-Paura", "Musterstrasse", 8));
        assertEquals(1, pv.persons.size());
    }

    @Test
    public void testReturnMessageIfListContainsFiveElements() {

        pv = new PersonVerwaltung();
        pv.createPerson("Jakob", "Penninger");
        pv.createPerson("Tick", "Duck");
        pv.createPerson("Trick", "Duck");
        pv.createPerson("Track", "Duck");
        pv.createPerson("Truck", "Duck");
        assertEquals(5, pv.persons.size());

    }
    
    @Test
    public void testRemovingPerson() {

        pv = new PersonVerwaltung();

        jakob = new Person("Jakob", "Penninger", Gender.MALE, LocalDate.of(1979, 8, 24));
        simone = new Person("Simone", "Penninger", Gender.FEMALE, LocalDate.of(1988, 12, 8));
        mia = new Person("Mia", "Penninger", Gender.FEMALE, LocalDate.of(2008, 2, 8));
        nico = new Person("Nico", "Penninger", Gender.MALE, LocalDate.of(2014, 11, 11));
        ines = new Person("Ines", "Penninger", Gender.FEMALE, LocalDate.of(2018, 4, 14));

        pv.addPerson(jakob);
        pv.addPerson(simone);
        pv.addPerson(mia);
        pv.addPerson(nico);
        pv.addPerson(ines);
        assertEquals(pv.persons.size(), 5);

        pv.removePerson(ines);
        assertEquals(pv.persons.size(), 4);

    }

}
