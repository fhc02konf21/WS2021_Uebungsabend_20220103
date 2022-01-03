package org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer {

    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    private double calcBMI(Person p) {
        return p.getWeight() / ((p.getSize() / 100.0) * (p.getSize() / 100.0));
    }

    @Override
    public void analyze() {
        for (Person person : super.getPersons()) {
            double bmi = calcBMI(person);

            Pair<Person, Double> pair = new Pair<>(person, bmi);
            result.add(pair);

            //result.add(new Pair<>(person, bmi));
        }
    }
}
