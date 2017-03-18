package com.assignment2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/18.
 */
public class MultiplicationTest {

    Multiplication mul;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before class");
    }

    @Test
    public void testMultiplication() throws Exception{
        mul = new Multiplication(4.0,2.0);
        assertNotNull(mul);
    }

    @Test
    public void setNum1() throws Exception {
        mul = new Multiplication();
        mul.setNum1(4.0);
        assertTrue(4.0 == mul.getNum1());
    }

    @Test
    public void setNum2() throws Exception {
        mul = new Multiplication();
        mul.setNum2(2.0);
        assertTrue(2.0 == mul.getNum2());
    }

    @Test
    public void getNum1() throws Exception {
        mul = new Multiplication(4.0,2.0);
        assertEquals(4.0, mul.getNum1(),0);
    }

    @Test
    public void getNum2() throws Exception {
        mul = new Multiplication(4.0,2.0);
        assertEquals(2.0, mul.getNum2(),0);
    }

    @Test
    public void calculate() throws Exception {
        mul = new Multiplication(4.0,2.0);
        assertEquals(8.0, mul.calculate(),0);
    }

}