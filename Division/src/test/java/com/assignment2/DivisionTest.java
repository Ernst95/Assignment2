package com.assignment2;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ernst on 2017/03/18.
 */
public class DivisionTest{

    Division div;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before class");
    }

    @Test
    public void testDivision() throws Exception{
        div = new Division(4.0,2.0);
        assertNotNull(div);
    }

    @Test
    public void setNum1() throws Exception {
        div = new Division();
        div.setNum1(4.0);
        assertTrue(4.0 == div.getNum1());
    }

    @Test
    public void setNum2() throws Exception {
        div = new Division();
        div.setNum2(4.0);
        assertTrue(4.0 == div.getNum2());
    }

    @Test
    public void getNum1() throws Exception {
        div = new Division(4.0,2.0);
        assertEquals(4.0, div.getNum1(),0);
    }

    @Test
    public void getNum2() throws Exception {
        div = new Division(4.0,2.0);
        assertEquals(2.0, div.getNum2(),0);
    }

    @Test
    public void calculate() throws Exception {
        div = new Division(4.0,2.0);
        assertEquals(2.0, div.calculate(),0);
    }

}