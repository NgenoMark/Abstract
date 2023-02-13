package com.Abstarctclass;

public abstract  class Quad {
    //declare the variables
    protected  float a;
    protected  float b;

    //create the constructor
    public Quad(float a, float b){
        this.a=a;
        this.b=b;
    }

    //some abstract methods
    //Area
    public abstract  float getArea();

    //Perimeter
    public abstract  float getPerimeter();


}
