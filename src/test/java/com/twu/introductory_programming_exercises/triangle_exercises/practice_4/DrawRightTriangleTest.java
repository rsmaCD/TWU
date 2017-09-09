package com.twu.introductory_programming_exercises.triangle_exercises.practice_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by rsma on 09/09/2017.
 */
public class DrawRightTriangleTest {

    private DrawRightTriangle drawRightTriangle = new DrawRightTriangle();

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
    public void should_print_1_asterisk_given_1() throws Exception {
        drawRightTriangle.printAsteriskRightTriangle(1);
        assertEquals("*\n", consoleLog.toString());
    }

    @Test
    public void should_print_right_triangle_asterisk_given_3() throws Exception {
        drawRightTriangle.printAsteriskRightTriangle(3);
        assertEquals("*\n**\n***\n", consoleLog.toString());
    }

}