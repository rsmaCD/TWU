package com.twu.introductory_programming_exercises.diamond_exercises.practice_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by rsma on 09/09/2017.
 */
public class DiamondTest {

    private Diamond diamond = new Diamond();

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
    public void should_print_nothing_given_0() throws Exception {

        diamond.printDiamond(0);
        assertEquals("", consoleLog.toString());
    }

    @Test
    public void should_print_one_asterisk_given_1() throws Exception {

        diamond.printDiamond(1);
        assertEquals("*\n", consoleLog.toString());
    }

    @Test
    public void should_print_diamond_asterisk_given_3() throws Exception {

        diamond.printDiamond(3);
        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", consoleLog.toString());
    }

    @Test
    public void should_print_diamond_asterisk_given_2() throws Exception {

        diamond.printDiamond(2);
        assertEquals(" * \n***\n * \n", consoleLog.toString());
    }
}