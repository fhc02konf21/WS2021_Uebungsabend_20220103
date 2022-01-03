package org.campus02.oop;

import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> persons; // = new ArrayList<>(); // 1. Möglichkeit

    // 2. Möglichkeit
    public PersonManager() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public void doAnalysis(PersonAnalyzer a) {
        a.setPersons(this.persons);
        a.analyze();
    }
}
