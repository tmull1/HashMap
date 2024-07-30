package org.example;

public class Book {
    private String name;
    private int publicationYear;
    private String content;

    public Book(String name, int publicationYear, String content) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + publicationYear + ")\nContents: " + content;
    }
}

