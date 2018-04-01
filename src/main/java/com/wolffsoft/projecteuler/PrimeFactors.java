package com.wolffsoft.projecteuler;

public class PrimeFactors {
    public long getLargestPrimeFactor(long number) {
        long factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number == 1) {
                break;
            }
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
                System.out.println("Factor: " + i);
            }
        }
        System.out.println(number == 1 ? factor : number);
        return number == 1 ? factor : number;
    }
}
