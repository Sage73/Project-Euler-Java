package com.company;

import java.util.ArrayList;

public class Problem7 {
    public static void main(String[] args) {
        /* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        What is the 10 001st prime number? */

        ArrayList <Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        boolean found = false;
        for (int i = 3; !found ; i+=2) {
            int sqrt = (int) Math.round(Math.sqrt(i));
            for (int j = 3; j <= sqrt; j++) {
                if (i % j == 0) break;
                else if (j == sqrt) {
                    primes.add(i);
                    if (primes.size() >= 10_001) {
                        found = true;
                        System.out.println(primes);
                    }
                }
            }
        }
    }
}
