package com.twu.introductory_programming_exercises.prime_factors_exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rsma on 09/09/2017.
 */
public class PrimeFactors {

    public List<Integer> printPrimeFactors(int n) {

        List<Integer> primeFactorList = new ArrayList<>();
        if (n == 0) {
            return primeFactorList;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                primeFactorList.add(i);
            }
        }
        return primeFactorList;
    }
}
