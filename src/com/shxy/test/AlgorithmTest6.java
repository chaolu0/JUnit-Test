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
 * @since <pre>ʮ���� 22, 2018</pre>
 * ·������
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
                //·������ʹ������ÿһ�����ܵ�·������ִ��һ�Ρ�
                {0, 0, 0, 0},//·�� N N
                {1, 1, 0, 1},//·�� Y N
                {2, 0, 2, 3},//·�� N Y
                {2, 2, 2, 4},//·�� Y Y
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
