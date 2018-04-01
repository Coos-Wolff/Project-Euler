package com.wolffsoft.projecteuler;

import java.util.ArrayList;

public class Fibonacci {
    public long getFibonacci() {
        int sum = 0;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int one = 1;
        int two = 2;
        fibonacci.add(one);

        while (two <= 4000000) {
            fibonacci.add(two);
            int temp = one;
            one = two;
            two = temp + two;
        }
        for (int i : fibonacci) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
