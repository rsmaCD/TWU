package com.twu.introductory_programming_exercises.prime_factors_exercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by rsma on 09/09/2017.
 */
public class PrimeFactorsTest {

    private PrimeFactors primeFactors = new PrimeFactors();
    private final ByteArrayOutputStream consoleLog = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(consoleLog));
    }

    @After
    public void tearDown() throws Exception {
        consoleLog.close();
    }

    @Test
    public void should_get_an_empty_list_given_0() throws Exception {
        List<Integer> primeFactorList = primeFactors.printPrimeFactors(0);
        assertTrue(primeFactorList.isEmpty());
    }

    @Test
    public void should_get_an_empty_list_given_1() throws Exception {
        List<Integer> primeFactorList = primeFactors.printPrimeFactors(1);
        assertTrue(primeFactorList.isEmpty());
    }

    @Test
    public void should_get_prime_factor_list_given_30() throws Exception {
        List<Integer> primeFactorList = primeFactors.printPrimeFactors(30);
        assertEquals(3, primeFactorList.size());
        assertTrue(primeFactorList.contains(2));
        assertTrue(primeFactorList.contains(3));
        assertTrue(primeFactorList.contains(5));
    }
}