package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Project euler (Problem 1)

        List<Integer> multiplesOf3 = new ArrayList<Integer>();
        List<Integer> multiplesOf5 = new ArrayList<Integer>();

        //check if is multiple of 3 or 5
        for (int i = 1; i < 10; i++) { // change the 1000 into threshold that you want
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
    }
}