package com.codersbay;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        PersonVerwaltung pv = new PersonVerwaltung();

        pv.createPerson("Jakob", "Penninger");
        pv.createPerson("Jakob", "Penninger", Gender.MALE, LocalDate.of(1979, 8, 24));
        pv.createPerson("Simone", "Penninger", Gender.FEMALE, LocalDate.now());

    }

}
