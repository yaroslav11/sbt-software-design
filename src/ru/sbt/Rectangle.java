package ru.sbt;

public class Rectangle extends Shape {
    double side_a = 0;
    double side_b = 0;

    Rectangle(){
        this(0, 0);
    }
    Rectangle(double side_a, double side_b){
        this.setName("Rectangle");
        this.side_a = side_a;
        this.side_b = side_b;
        this.calculateArea();
    }
    @Override
    protected void calculateArea() {
        this.setArea(this.side_a * this.side_b);
    }
}
