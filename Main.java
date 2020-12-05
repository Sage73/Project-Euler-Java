package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    // Project euler (Problem 1)
        /* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

        Find the sum of all the multiples of 3 or 5 below 1000. */


        List<Integer> multiplesOf3 = new ArrayList<Integer>();
        List<Integer> multiplesOf5 = new ArrayList<Integer>();

        //check if is multiple of 3 or 5
        for (int i = 1; i < 1000; i++) { // change the 1000 into threshold that you want
            if (i % 5 == 0) {
                multiplesOf5.add(i);
            } else if (i % 3 == 0) {
                multiplesOf3.add(i);
            }
        }

        // sum of all numbers inside the list
        int sumOf3 = multiplesOf3.stream().mapToInt(Integer::intValue).sum();
        int sumOf5 = multiplesOf5.stream().mapToInt(Integer::intValue).sum();

        // merge the 2 lists
        int result = sumOf3 + sumOf5;

        System.out.println("Problem 1: " + result);

        // Importing all other classes
        Problem2.main(args);
        Problem3.main(args);
        Problem4.main(args);

        Test.main(args);
    }
}
