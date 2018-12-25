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
 * 条件组合覆盖
 */
@RunWith(Parameterized.class)
public class AlgorithmTest5 {
    private int a;
    private int b;
    private int c;
    private int expected;

    public AlgorithmTest5(int a, int b, int c, int expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                //条件组合覆盖每个判定中各条件的每一种组合至少出现一次。
                {2, 2, 1, 3},//条件 T,T,T,T
                {2, 0, 0, 0},//条件 T,F,T,F
                {0, 2, 2, 2},//条件 F,T,F,T
                {0, 0, 0, 0},//条件 F,F,F,F
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
