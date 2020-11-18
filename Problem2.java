package com.company;

import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
    // Project euler (problem 2)
        /* Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
            1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
            By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms. */
        int a, b ,c;
        a = 1;
        b = 2;
        ArrayList<Integer> fibNums = new ArrayList<>();
        fibNums.add(a);
        fibNums.add(b);
        fibNums.add(0);
        while (true) {
            c = a + b;
            if (c > 4_000_000) {
                break;
            }
            a = c + b;
            if (a > 4_000_000) {
                break;
            }
            b = a + c;
            if (b > 4_000_000) {
                break;
            }
            fibNums.add(2, c);
            fibNums.add(0, a);
            fibNums.add(1, b);
        }
        ArrayList<Integer> evenFibNums = new ArrayList<>();
        for (Integer fibonacciNum:
             fibNums) {
            if (fibonacciNum % 2 == 0) {
                evenFibNums.add(fibonacciNum);
            }
        }
        System.out.println(evenFibNums);
    }
}
