package com.assignment2;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ernst on 2017/03/18.
 */
public class AdditionTest{

    Addition add;

    @Before
    public void setUp() throws Exception{
        System.out.println("Before class");

    }

    @Test
    public void testAddition() throws Exception{
        add = new Addition(4.0,2.0);
        Assert.assertNotNull(add);
    }

    @Test
    public void testSetNum1() throws Exception {
        add = new Addition();
        add.setNum1(4.0);
        Assert.assertTrue(4.0 == add.getNum1());

    }

    @Test
    public void testSetNum2() throws Exception {
        add = new Addition();
        add.setNum2(2.0);
        Assert.assertTrue(2.0 == add.getNum2());

    }

    @Test
    public void testGetNum1() throws Exception {
        add = new Addition(4.0,2.0);
        Assert.assertEquals(4.0, add.getNum1(),0);
    }

    @Test
    public void testGetNum2() throws Exception {
        add = new Addition(4.0,2.0);
        Assert.assertEquals(2.0, add.getNum2(),0);
    }

    @Test
    public void testCalculate() throws Exception {
        add = new Addition(4.0,2.0);
        Assert.assertEquals(6.0, add.calculate(),0);
    }

}