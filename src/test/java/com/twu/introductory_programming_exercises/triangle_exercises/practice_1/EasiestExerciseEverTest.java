package com.twu.introductory_programming_exercises.triangle_exercises.practice_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by rsma on 08/09/2017.
 */
public class EasiestExerciseEverTest {

    private EasiestExerciseEver easiestExerciseEver = new EasiestExerciseEver();

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
    public void should_print_one_asterisk() throws Exception {

        easiestExerciseEver.printSomething("*");
        assertEquals("*", consoleLog.toString());
    }
}