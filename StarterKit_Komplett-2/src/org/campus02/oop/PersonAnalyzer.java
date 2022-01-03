package org.campus02.oop;

import java.util.ArrayList;

public abstract class PersonAnalyzer {

    private ArrayList<Person> persons;

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    // muss nicht gemacht werden, leerer Konstruktor automatisch vorhanden
    public PersonAnalyzer() {
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public abstract void analyze();
}
