package com.Work;

public abstract class Triangle {
    public float sideA;
    public float sideB;
    public float sideC;

    public Triangle(float sideA, float sideB, float sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    public abstract float getPerimeter();

}
