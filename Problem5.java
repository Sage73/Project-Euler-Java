package com.company;

public class Problem5 {
    public static void main(String[] args) {
        /* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */

        boolean found = false;
        while (!found) {
            for (int i = 1; !found; i++) {
                for (int j = 1; j <= 20; j++) {
                    if (j == 20) {
                        System.out.println(i);
                        found = true;
                    } else if (i % j != 0) {
                        break;
                    }
                }
            }
        }
    }
}
