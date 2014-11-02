package com.mikalai.testing;

import org.junit.*;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)

public class CalculatorTest {

    int aa;
    int bb;
    int res;
    public CalculatorTest(int a, int b, int res) {
        System.out.println("constructor");
        this.aa = a;
        this.bb = b;
        this.res = res;

    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0}, {1, 1, 2}, {2, 1, 3}, {3, 2, 5}, {4, 3, 7}, {5, 5, 10}, {6, 8, 14}
        });
    }

    private  Calculator calc = null;


    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");

    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");

    }

    @Before
    public  void init(){
        System.out.println("before");
        calc = new CalculatorImpl();

    }

    @After
    public void after(){
        System.out.println("after");

    }


    @Test
    public void testSum(){
        Assert.assertSame(calc.sum(this.aa, this.bb), this.res);
    }

    @Test
    public void testSub(){
        Assert.assertSame(calc.sub(3, 1), 2);
    }

    @Test
    public void testMul(){
        Assert.assertSame(calc.mul(4, 2), 8);
    }



    @Test
    public void testDiv(){
        Assert.assertSame(calc.div(9, 3), 3);
    }


}