package org.example;

public class StudentResult {
    String studNumber;
    String name;
    double[] mark={60,32,78};

    StudentResult(String studNumber,String name,double[] mark){
        this.studNumber=studNumber;
        this.name=name;
        this.mark=mark;

    }
    double average(){
        double total=0;
        for(int i=0;i< mark.length;i++)
        {
            System.out.print(mark[i]+",");



            total=total+mark[i];



        }
        double avg=total/ mark.length;
        return avg;

    }
}
