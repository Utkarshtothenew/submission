package com.tothenew.springday1assgn.Ques2;

interface Shape {
    void show();
}

class Rectangle implements Shape {
    @Override
    public void show() {
        System.out.println("I am a rectangle");
    }
}

class Circle implements Shape {

    @Override
    public void show() {
        System.out.println("i am circle");
    }
}

public class LoosleyCoupled {
    public static void main(String[] args) {
        showShape(new Circle());
        showShape(new Rectangle());
    }

    public static void showShape(Shape shape) {
        shape.show();
    }
}
