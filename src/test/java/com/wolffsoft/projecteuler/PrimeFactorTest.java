package com.wolffsoft.projecteuler;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PrimeFactorTest {

    @Test
    public void shouldTestPrimeFactors() {
        assertEquals(29, isLargestPrimeFactor(13195));
    }

    public int isLargestPrimeFactor(int number) {
        ArrayList<Integer> primes = new ArrayList<>();
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= number; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i ;
                primes.add(i);
            }

        }
        for (int prime : primes) {
            
        }
        System.out.println(primes.toString());
        return (Integer.valueOf(primeNumbers));
    }

    private List<Integer> primeNumbers(int number) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
        return primes;
    }

    private boolean isPrime(int number) {
        boolean isPrime = false;
        for (int i = 2; 2 * i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
