package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ////////////Task1//////////////
        Shapetest one=new Shapetest();

    /////////////Task2//////////////
        Scanner scan=new Scanner(System.in);
        String color;
        int size;
        color=scan.nextLine();
        size= scan.nextInt();
        Ball first=new Ball(size,color);
        System.out.println(first.toString());


        //////////Task3///////////////////
        String nameOfBook,author;
        int date,pages;
        nameOfBook= scan.nextLine();;
        author= scan.nextLine();
        date= scan.nextInt();
        pages= scan.nextInt();
        Book firstBook= new Book(nameOfBook,author,date,pages);
        System.out.println(firstBook.toString());
        /////////Task4//////////////////

    }

}
