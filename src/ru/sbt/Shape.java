package ru.sbt;

public abstract class Shape {
    private String name = "No name";
    private double area = 0;

    protected void setName(String name){
        this.name = name;
    }
    protected void setArea(double area){
        this.area = area;
    }
    public String getName(){
        return this.name;
    }
    public double getArea(){
        return this.area;
    }
    protected abstract void calculateArea();
    public void print(){
        System.out.println(this.getName() + " with area " + this.getArea());
    }
}
