package com.twu.introductory_programming_exercises.fizzbuzz_exercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

/**
 * Created by rsma on 09/09/2017.
 */
public class FizzBuzzTest {

    private static final String FizzBuzzOutPutTemplateFileName = "src/test/resources/FizzBuzzOutPut.txt";
    private FizzBuzz fizzBuzz = new FizzBuzz();
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
    public void should_print_fizz_buzz_of_1_through_100() throws Exception {

        fizzBuzz.printFizzBuzz();
        assertEquals(Files.lines(Paths.get(FizzBuzzOutPutTemplateFileName), StandardCharsets.UTF_8)
                .reduce("", (sum, item) -> sum + item +"\n"), consoleLog.toString());
    }

}