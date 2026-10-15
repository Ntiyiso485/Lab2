package org.example;

public class Rectangle {
    private double width;
    private double height;

    Rectangle(double width,double height){
     this.height=height;
     this.width=width;
    }
    public void displayDetails() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
    double area(){
        return width * height;

    }
    double  perimeter(){
        return 2 * (width + height);


    }
}
