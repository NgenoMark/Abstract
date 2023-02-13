package com.Work;

public class Trianglemain {
    public static void main (String [] args){
        RigthTriangle right1 = new RigthTriangle(8,3,7);
        right1.getPerimeter();

        //Output of perimeter
        System.out.println("The perimeter is " + right1.getPerimeter() );
    }
}
