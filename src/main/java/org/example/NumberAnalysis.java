package org.example;

import java.util.Scanner;

public class NumberAnalysis {
    void oddOrEven(){

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Integer:");
        int digit=scan.nextInt();
        if (digit > 0) {
            System.out.println("The number is positive.");
        } else if (digit < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        if (digit % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
