package ru.sbt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void calculateArea() {
        double r = 12.34;
        Circle c1 = new Circle(0+r);
        assertEquals(0+(Math.PI * r * r), 0+c1.getArea(), 1>>32);
    }

}