package com.wolffsoft.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void shouldTestFibonacciMultiplies() {
        assertEquals(4613732, fibonacci.getFibonacci());
    }
}
