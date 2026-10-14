package org.example;

import java.util.Scanner;

public class PassOrFail {
    void passOrFail() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Mark:");
        int mark = scan.nextInt();

        if (mark >= 50 & mark <= 100) {
            System.out.println("Pass");

        } else if (mark > 100 || mark < 0) {
            System.out.println("Invalid Mark!");
        } else {
            System.out.println("Fail");
        }
    }

}
