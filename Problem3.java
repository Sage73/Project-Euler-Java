package com.company;

import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
        /* The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ?*/
        ArrayList <Long> primeFactors = new ArrayList<>();
        long num = 600851475143L;
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                num /= i;
                primeFactors.add(i);
            }
        }
        primeFactors.add(num);
        System.out.println("problem 3: " + primeFactors);
    }
}
