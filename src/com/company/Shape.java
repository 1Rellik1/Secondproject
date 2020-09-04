package com.company;

public class Shape {
    private int numderofShapes;
    private String nameofFigure;
    private int Square;
    private int perimeter;

    public Shape(int numderofShapes, String nameofFigure, int square, int perimeter) {
        this.numderofShapes = numderofShapes;
        this.nameofFigure = nameofFigure;
        Square = square;
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "numderofShapes=" + numderofShapes +
                ", nameofFigure='" + nameofFigure + '\'' +
                ", Square=" + Square +
                ", perimeter=" + perimeter +
                '}';
    }
}

