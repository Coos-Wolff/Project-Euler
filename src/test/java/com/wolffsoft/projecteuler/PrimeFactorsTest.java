package com.wolffsoft.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    private PrimeFactors primeFactors = new PrimeFactors();

    @Test
    public void shouldTestLargestPrimeFactor() {
        assertEquals(29, primeFactors.getLargestPrimeFactor(13195));
        assertEquals(6857, primeFactors.getLargestPrimeFactor(600851475143L));
    }
}
