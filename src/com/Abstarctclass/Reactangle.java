package com.Abstarctclass;

public class Reactangle extends Quad {
    //Constructor
    public Reactangle(float a, float b){
        // use the super keyword to inherit attributes  a and b from Quad
        super(a, b);
    }

    //do the concrete implementations
    @Override
    public float getArea() {
        return a*b;
    }
    @Override
    public float getPerimeter(){
        return 2*(a+b);
    }
}
