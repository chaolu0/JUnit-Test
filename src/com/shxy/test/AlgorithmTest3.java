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
 * 条件覆盖
 */
@RunWith(Parameterized.class)
public class AlgorithmTest3 {
    private int a;
    private int b;
    private int c;
    private int expected;

    public AlgorithmTest3(int a, int b, int c, int expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                //条件覆盖每个判定的每个条件应取到各种可能的值。
                {2, 0, 0, 0},//4个判断 分别是 T F T F
                {0, 1, 1, 1}//4个判断 分别时 F T F T
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
