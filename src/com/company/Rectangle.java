package com.company;

public class Rectangle {
    private int length;
    private int width;
    private final String name = "My Rectangle";

    public Rectangle(int length, int widths) {
        this.length = length;
        this.width = widths;
    }

    public int getLength() {
        int i = 0;
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidths() {
        return width;
    }

    public void setWidths(int widths) {
        this.width = widths;
    }
    public static int getArea(int a, int b){
        return a * b;
    }
    public int getArea(){
        return length * width;
    }
}
