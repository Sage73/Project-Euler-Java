package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class Problem6 {
    public static void main(String[] args) {
        /* Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 -385 = 2640
        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. */

        ArrayList <Integer> sumOfSquares = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares.add((int) Math.pow(i, 2));
        }

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        int sumOfSquare = sumOfSquares.stream().mapToInt(Integer::intValue).sum();
        int squareOfSum = (int) Math.pow(sum, 2);

        int result = squareOfSum - sumOfSquare;
        System.out.println("Problem 6: " + result);
    }
}
