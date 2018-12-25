package com.shxy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Algorithm Tester.
 *
 * @author <Authors shxy>
 * @version 1.0
 * @since <pre>十二月 22, 2018</pre>
 * 判定条件覆盖
 */
@RunWith(Parameterized.class)
public class AlgorithmTest4 {
    private int a;
    private int b;
    private int c;
    private int expected;

    public AlgorithmTest4(int a, int b, int c, int expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                //判定/条件覆盖同时满足判定覆盖条件覆盖。
                {2, 2, 1, 3},//判定T,T 条件T,T,T,T
                {0, 0, 0, 0}//判定F,F 条件F,F,F,F
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
