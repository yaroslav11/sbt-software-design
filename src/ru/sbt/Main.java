package ru.sbt;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.print();
        Circle c2 = new Circle(1);
        c2.print();

        Rectangle r1 = new Rectangle();
        r1.print();
        Rectangle r2 = new Rectangle(4, 4.5);
        r2.print();

        Square s1 = new Square();
        s1.print();
        Square s2 = new Square(1.2);
        s2.print();

    }
}
