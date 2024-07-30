package org.example;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationMap;


    public Abbreviations() {
        this.abbreviationMap = new HashMap<>();
    }


    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationMap.put(abbreviation, explanation);
    }


    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationMap.containsKey(abbreviation);
    }


    public String findExplanationFor(String abbreviation) {
        return this.abbreviationMap.get(abbreviation);
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}

