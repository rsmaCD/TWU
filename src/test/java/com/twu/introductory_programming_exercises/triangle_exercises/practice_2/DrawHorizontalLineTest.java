package com.twu.introductory_programming_exercises.triangle_exercises.practice_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by rsma on 08/09/2017.
 */
public class DrawHorizontalLineTest {

    private DrawHorizontalLine drawHorizontalLine = new DrawHorizontalLine();

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
        drawHorizontalLine.printAsteriskLine(1);
        assertEquals("*\n", consoleLog.toString());
    }

    @Test
    public void should_print_2_asterisk_given_2() throws Exception {
        drawHorizontalLine.printAsteriskLine(2);
        assertEquals("**\n", consoleLog.toString());
    }

    @Test
    public void should_print_8_asterisk_given_8() throws Exception {
        drawHorizontalLine.printAsteriskLine(8);
        assertEquals("********\n", consoleLog.toString());
    }
}