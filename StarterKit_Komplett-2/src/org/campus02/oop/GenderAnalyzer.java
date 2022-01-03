package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer {

    @Override
    public void analyze() {
        int mCount = 0;
        int wCount = 0;
        int mSize = 0;
        int wSize = 0;

        for (Person person : super.getPersons()) {
            // 1. bin ich weiblich oder männlich
            // 2. zähle count um 1 hoch und addiere die Größe
            if (person.getGender() == 'M') {
                mCount++; //mCount += 1;
                mSize += person.getSize();
            }
            if (person.getGender() == 'F') {
                wCount++;
                wSize += person.getSize();
            }
        }

        System.out.println("In der Liste existieren " + mCount + " Männer mit einer durchschnittlichen Körpergröße von " + (mSize / mCount) + " cm."); // STRG + D -> kopieren
        System.out.println("In der Liste existieren " + wCount + " Frauen mit einer durchschnittlichen Körpergröße von " + (wSize / wCount) + " cm.");
    }
}
