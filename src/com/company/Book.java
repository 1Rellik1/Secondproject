package com.company;

public class Book {
    private String name;
    private String Author;
    private int YearOfPublishing;
    private int NubmerOfPages;

    public Book(String name, String author, int yearOfPublishing, int nubmerOfPages) {
        this.name = name;
        Author = author;
        YearOfPublishing = yearOfPublishing;
        NubmerOfPages = nubmerOfPages;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", YearOfPublishing=" + YearOfPublishing +
                ", NubmerOfPages=" + NubmerOfPages +
                '}';
    }
}
