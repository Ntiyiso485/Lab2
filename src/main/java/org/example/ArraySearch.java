package org.example;

public class ArraySearch {

    void search(int target){
        int[] numbers={23,57,28,89,8,28,67};
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                System.out.println("Value found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Value not found");
        }

    }
}
