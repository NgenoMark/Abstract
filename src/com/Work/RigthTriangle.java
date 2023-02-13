package com.Work;

public class RigthTriangle extends Triangle{

    public RigthTriangle(float sideA,float sideB, float sideC){
        super(sideA,sideB,sideC);
    }

    @Override
    public float getPerimeter(){
        return sideA+sideB+sideC;
    }
}
