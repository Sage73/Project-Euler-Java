package com.company;

public class Problem4 {
    public static void main(String[] args) {
        //A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        //Find the largest palindrome made from the product of two 3-digit numbers.

        int product, copy, reverse = 0, max = 0;
        for (int i = 999; i >= 1; i--) {
            for (int j = 999; j >= 1 ; j--) {
                product = i * j;
                copy = product;
                while(product != 0) {
                    reverse = reverse * 10;
                    reverse = reverse + product%10;
                    product = product/10;
                }
                if (copy == reverse) {
                    if (copy > max) {
                        max = copy;
                    }
                }
                reverse = 0;
            }
        }
        System.out.println("problem 4: " + max);
    }
}
