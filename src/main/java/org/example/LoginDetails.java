package org.example;

import java.util.Scanner;

public class LoginDetails {
    String username="siya";
    String password="12345";

    void login(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Username:");
        String user=scan.next();
        System.out.print("Enter the Password:");
        String pass=scan.next();

        if(user.equals(username))
        {
            System.out.println("Valid Username!");
            if(pass.equals(password))
            {
                System.out.println("Logged in Successfully");
            }
            else {
                System.out.println("Invalid password!");
            }
        }
        else
        {
            System.out.println("Invalid Username!");
        }


    }
}
