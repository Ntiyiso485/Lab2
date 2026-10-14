package org.example;

import java.util.ArrayList;

public class EvenOddArray {
    void evenOdd(){
        int [] numbers={23,45,68,39,48,87,94};
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        ArrayList<Integer> oddNumbers=new ArrayList<>();
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0)
            {
               evenNumbers.add(numbers[i]);
               countEven++;
            }
            else
            {
                oddNumbers.add(numbers[i]);
                countOdd++;
            }
            System.out.print(numbers[i]+",");
        }
        System.out.println("");
        System.out.print("The Array of Even Numbers are:"+countEven);
        System.out.println("");
        System.out.print("Even Numbers: ");
        for(int i=0;i<evenNumbers.size();i++){
            System.out.print(evenNumbers.get(i)+" ,");

        }
        System.out.println("");
        System.out.println("The Array of Odd Numbers are:"+countOdd);
        System.out.print("Odd Numbers :");

        for(int i=0;i<oddNumbers.size();i++){
            System.out.print(oddNumbers.get(i)+" ,");

        }
    }
}
