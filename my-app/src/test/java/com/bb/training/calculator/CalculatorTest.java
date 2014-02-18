package com.bb.training.calculator;

/**
 * Created by rching on 2/17/14.
 */
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

Calculator cal;

    @Before
    public void setUp() throws Exception{
        cal = new Calculator();
    }

    @Test
    public void testSum() throws Exception{
        int result = cal.sum(2, 4);
        assertEquals(6, result);
        assertThat(result,is(6));
    }

    @Test
    public void testRest() throws Exception{
        int result = cal.rest(4, 2);
        assertEquals(2,result);
        assertThat(result,is(2));

    }

    @After
    public void tearDown() throws Exception{
     System.out.println("Test was executed successfully");

    }

    //BeforeClass,AfterClass

}
