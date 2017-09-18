package ru.sbt;

public class Circle extends Shape {
    double radius = 0;

    Circle(){
        this(0);
    }

    Circle(double radius){
        this.setName("Circle");
        this.radius = radius;
        this.calculateArea();
    }

    @Override
    protected void calculateArea() {
        this.setArea(Math.PI * this.radius * this.radius);
    }
}
