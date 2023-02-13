package com.Abstarctclass;

public class Shapemain {
    public static void  main(String [] args){
        Reactangle rectangle1= new Reactangle(9,6);
        rectangle1.getPerimeter();
        rectangle1.getArea();

        //Result of calculations
        System.out.println("The area of the rectangle is ; " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle is ; " + rectangle1.getPerimeter());


    }
}
