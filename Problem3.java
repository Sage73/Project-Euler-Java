package com.company;

import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
        /* The prime factors of 13195 are 5, 7, 13 and 29.
        What is the largest prime factor of the number 600851475143 ? */
        int num = 48;
        ArrayList primeFactor = new ArrayList();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                primeFactor.add(i);
                num = num / i;
            }
        }
        System.out.println(primeFactor);
    }
}
