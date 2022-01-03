package org.campus02.oop;

import java.util.ArrayList;

public class MaxSalaryAnalyzer extends PersonAnalyzer {

    @Override
    public void analyze() {
        final ArrayList<Person> persons = super.getPersons();
        int highestSalary = 0;
        for (Person person : persons) {
            if (person.getSalary() > highestSalary) {
                highestSalary = person.getSalary();
            }
        }

        for (Person person : persons) {
            if (person.getSalary() == highestSalary) {
                System.out.println("person = " + person);
            }
        }
    }
}
