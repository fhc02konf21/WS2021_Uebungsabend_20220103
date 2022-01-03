package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer {

    private HashMap<String, Integer> result = new HashMap<>();

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        final ArrayList<Person> persons = super.getPersons();
        for (Person person : persons) {
            //if (result.keySet().contains(person.getCountry())) {
            if (result.containsKey(person.getCountry())) {
                Integer count = result.get(person.getCountry());
                count++;
                result.put(person.getCountry(), count);
            } else {
                // initial
                result.put(person.getCountry(), 1);
            }
        }
    }
}
