package com.codersbay;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonVerwaltungTest {

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

        PersonVerwaltung pv = new PersonVerwaltung();
        pv.createPerson("Jakob", "Penninger");
        pv.createPerson("Tick", "Duck");
        pv.createPerson("Trick", "Duck");
        pv.createPerson("Track", "Duck");
        pv.createPerson("Truck", "Duck");
        assertEquals(5, pv.persons.size());
    }

}
