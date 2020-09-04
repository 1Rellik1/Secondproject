package com.company;

public class Ball {
    private int size;
    private String color;

    public Ball(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
