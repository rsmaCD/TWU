package com.twu.introductory_programming_exercises.diamond_exercises.practice_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by rsma on 09/09/2017.
 */
public class IsoscelesTriangleTest {

    private IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();

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
    public void should_print_one_asterisk_given_1() throws Exception {

        isoscelesTriangle.printIsoscelesTriangle(1);
        assertEquals("*\n", consoleLog.toString());
    }

    @Test
    public void should_print_isosceles_triangle_asterisk_given_3() throws Exception {

        isoscelesTriangle.printIsoscelesTriangle(3);
        assertEquals("  *  \n *** \n*****\n", consoleLog.toString());
    }
}