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
 * �ж�����
 */
@RunWith(Parameterized.class)
public class AlgorithmTest2 {
    private int a;
    private int b;
    private int c;
    private int expected;

    public AlgorithmTest2(int a, int b, int c, int expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                //�ж�����ÿ���ж���ÿ����֧����ִ��һ�Ρ�
                {2, 2, 1, 3},//���֧��һ��
                {0, 0, 0, 0}//�ٷ�֧��һ��
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