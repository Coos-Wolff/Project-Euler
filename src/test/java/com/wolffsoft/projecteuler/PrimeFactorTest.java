package com.wolffsoft.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeFactorTest {

    private PrimeFactors primeFactors = new PrimeFactors();

    @Test
    public void shouldTestPrimeFactors() {
        assertEquals(29, primeFactors.getLargestPrimeFactor(13195L));
        assertEquals(6857, primeFactors.getLargestPrimeFactor(600851475143L));
    }
}
