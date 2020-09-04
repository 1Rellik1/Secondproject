package com.company;

import java.util.Scanner;

public class Shapetest {
    public Shapetest() {
        String name;
        int shapes, square,perimetr;
        Scanner scan= new Scanner(System.in);
        name=scan.nextLine();
        shapes= scan.nextInt();
        square= scan.nextInt();
        perimetr= scan.nextInt();
        Shape square1 = new Shape(shapes, name, square, perimetr);
        System.out.println(square1.toString());
    }
}
