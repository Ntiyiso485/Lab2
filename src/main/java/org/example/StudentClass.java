package org.example;

public class StudentClass {
    String name;
    String studentNumber;
    double mark;

    StudentClass(String name,String studentNumber,double mark){
        this.name= name;
        this.studentNumber= studentNumber;
        this.mark=mark;

    }
    void displayDetails(){
        System.out.println("Name :"+this.name+"\n"+"Student Number :"+this.studentNumber+"\n"+
                "Mark :"+this.mark);


    }
    boolean hasPassed(double mark){
        if(mark>=50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
