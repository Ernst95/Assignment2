package com.assignment2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/18.
 */
public class SubtractionTest {

    Subtraction sub;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before class");
    }

    @Test
    public void testSubtraction() throws Exception{
        sub = new Subtraction(4.0,2.0);
        assertNotNull(sub);
    }

    @Test
    public void setNum1() throws Exception {
        sub = new Subtraction();
        sub.setNum1(4.0);
        assertTrue(4.0 == sub.getNum1());
    }

    @Test
    public void setNum2() throws Exception {
        sub = new Subtraction();
        sub.setNum2(2.0);
        assertTrue(2.0 == sub.getNum2());
    }

    @Test
    public void getNum1() throws Exception {
        sub = new Subtraction(4.0,2.0);
        assertEquals(4.0, sub.getNum1(),0);
    }

    @org.junit.Test
    public void getNum2() throws Exception {
        sub = new Subtraction(4.0,2.0);
        assertEquals(2.0, sub.getNum2(),0);
    }

    @org.junit.Test
    public void calculate() throws Exception {
        sub = new Subtraction(4.0,2.0);
        assertEquals(2.0, sub.calculate(),0);
    }

}