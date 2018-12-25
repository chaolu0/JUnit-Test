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
 * 路径覆盖
 */
@RunWith(Parameterized.class)
public class AlgorithmTest6 {
    private int a;
    private int b;
    private int c;
    private int expected;

    public AlgorithmTest6(int a, int b, int c, int expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                //路径覆盖使程序中每一条可能的路径至少执行一次。
                {0, 0, 0, 0},//路径 N N
                {1, 1, 0, 1},//路径 Y N
                {2, 0, 2, 3},//路径 N Y
                {2, 2, 2, 4},//路径 Y Y
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
