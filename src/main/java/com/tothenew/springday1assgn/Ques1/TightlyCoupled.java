package com.tothenew.springday1assgn.Ques1;

class Rectangle {
    public void show() {
        System.out.println("I am a rectangle");
    }
}

class Circle {
    Rectangle rectangle = new Rectangle();
    public void show() {
        rectangle.show();
    }
}

public class TightlyCoupled {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.show();
    }
}
