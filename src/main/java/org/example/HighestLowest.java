package org.example;

public class HighestLowest {
    int[] marks = {78, 67, 57, 90, 33, 45, 7, 63};
    int highest=marks[0];
    int lowest=marks[0];
    int count=0;
    void highLow() {
        for(int i = 0; i<marks.length;i++) {
            if(marks[i]>highest)
            {
                highest=marks[i];
            }
            if(marks[i]<lowest){
                lowest=marks[i];
            }
            if(marks[i]>=50){
                count++;
            }
            System.out.print(marks[i]+",");
       }
        System.out.println("");
        System.out.println("the Highest Value is:"+highest);
        System.out.println("the Lowest Value is:"+lowest);
        System.out.println("the Values  greater than or equal to 50 :"+count);
 }

}
