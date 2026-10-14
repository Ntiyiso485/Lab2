package org.example;

public class StoreMarks {
    int [] marks={30,67,98,54,46};
    int total=0;
    void display(){
        for(int i=0;i< marks.length;i++)
        {
            System.out.print(marks[i]+",");



            total=total+marks[i];


        }
        System.out.println();
        double avg=total/5;
        System.out.println("=========================================================================");
        System.out.println("the total marks of students are :"+total);
        System.out.println("the average marks of students are :"+avg);


    }
}
