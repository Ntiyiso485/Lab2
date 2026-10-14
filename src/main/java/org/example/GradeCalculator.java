package org.example;

import java.util.Scanner;

public class GradeCalculator {
    void cal(){

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Mark:");
        int mark=scan.nextInt();

        if(mark>0 & mark<50){
            System.out.println("Fail");

        }
        else if(mark>=50 & mark<=69){
            System.out.println("Pass");
        }
        else if(mark>=70 & mark<=79)
        {
            System.out.println("Merit");
        }
        else if(mark>=80 & mark<=100)
        {
            System.out.println("Distinction");
        }
        else if(mark>100 || mark<0){
            System.out.println("Invalid Mark!");
        }

    }
}
