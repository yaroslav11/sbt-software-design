package ru.sbt;

public class Square extends Rectangle {
    Square(){
        this(0);
    }
    Square(double side){
        super(side, side);
        this.setName("Square");
        this.calculateArea();
    }

}
