package com.twu.introductory_programming_exercises.fizzbuzz_exercise;

import com.utils.Print;

/**
 * Created by rsma on 09/09/2017.
 */
public class FizzBuzz {

    private static final String Fizz = "Fizz";
    private static final String Buzz = "Buzz";

    public void printFizzBuzz() {
        String str = buildStr();
        Print.print(str);
    }

    private String buildStr() {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= 100; i++) {
            String temp = i % 15 != 0 ? i % 5 != 0 ? i % 3 != 0 ? String.valueOf(i) : "Fizz" : "Buzz" : "FizzBuzz";
            sb.append( temp + "\n");
        }
        return sb.toString();
    }
}
