package com.Maths;

public class Rectangle implements Calculation {

        private float legnth;
        private float widht;

        public Rectangle(float legnth, float widht){
            this.legnth=legnth;
            this.widht=widht;
        }



   @Override
    public float getArea(){
            return (legnth*widht);
    }

    @Override
    public float getPerimeter(){
            return 2*(legnth+widht);
    }

    public void showDetails(){
            System.out.println("legnht is :" + legnth +"\n"
                    + "widht is : "+ widht+ "\n"
                    +"The area is :" + getArea() + "\n" +
                    "The perimeter is : " + getPerimeter() );
    }

}
