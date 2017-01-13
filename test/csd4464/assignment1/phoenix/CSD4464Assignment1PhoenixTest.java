/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.phoenix;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0690857
 */
public class CSD4464Assignment1PhoenixTest {

    public CSD4464Assignment1PhoenixTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    /**
     * Test of stringPower method, of class CSD4464Assignment1Phoenix.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String word = "";
        int number = 10;
        String expResult = "";
        String result = CSD4464Assignment1Phoenix.stringPower(word, number);
        assertEquals(expResult, result);
    }

    @Test
    public void testLessThanOneShouldReturnNull() {
        System.out.println("stringPower");
        String word = "aa";
        int number = 0;
        String expResult = null;
        String result = CSD4464Assignment1Phoenix.stringPower(word, number);
        assertEquals(expResult, result);
    }

    @Test
    public void testStringAndOneShouldReturnString() {
        System.out.println("stringPower");
        String word = "aa";
        int number = 1;
        String expResult = word;
        String result = CSD4464Assignment1Phoenix.stringPower(word, number);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {
        System.out.println("stringPower");
        String word = "bob";
        int number = 2;
        String expResult = "bobbob";
        String result = CSD4464Assignment1Phoenix.stringPower(word, number);
        assertEquals(expResult, result);
    }
}
