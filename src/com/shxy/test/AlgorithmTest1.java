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
 * @since <pre>ʮ���� 22, 2018</pre>
 * ��串��
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
                //��串��ÿ���������ִ��һ�Ρ�
                {2, 2, 1, 3}//������䶼ִ��һ��
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
