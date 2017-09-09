package com.twu.introductory_programming_exercises.diamond_exercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by rsma on 09/09/2017.
 */
public class DiamondWithNameTest {

    private DiamondWithName diamondWithName = new DiamondWithName();

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

        diamondWithName.printDiamondWithName(0);
        assertEquals("", consoleLog.toString());
    }

    @Test
    public void should_print_name_given_1() throws Exception {

        diamondWithName.printDiamondWithName(1);
        assertEquals("Bill\n", consoleLog.toString());
    }

    @Test
    public void should_print_diamond_with_name_given_3() throws Exception {

        diamondWithName.printDiamondWithName(3);
        assertEquals("  *  \n *** \nBill\n *** \n  *  \n", consoleLog.toString());
    }

    @Test
    public void should_print_diamond_with_name_given_2() throws Exception {

        diamondWithName.printDiamondWithName(2);
        assertEquals(" * \nBill\n * \n", consoleLog.toString());
    }

}