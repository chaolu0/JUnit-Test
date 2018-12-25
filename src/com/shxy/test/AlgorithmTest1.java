package com.shxy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Algorithm Tester.
 *
 * @author <Authors shxy>
 * @version 1.0
 * @since <pre>十二月 22, 2018</pre>
 * 语句覆盖
 */
@RunWith(Parameterized.class)
public class AlgorithmTest1 {
    private int a;
    private int b;
    private int c;
    private int expected;

    public AlgorithmTest1(int a, int b, int c, int expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                //语句覆盖每条语句至少执行一次。
                {2, 2, 1, 3}//所有语句都执行一次
        });
    }

    /**
     * Method: f(int a, int b, int c)
     */
    @Test
    public void testF() throws Exception {
        assertEquals(expected, Algorithm.f(a, b, c));
    }


} 
