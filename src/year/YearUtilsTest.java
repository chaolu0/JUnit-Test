package year;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


/**
 * YearUtils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮ���� 22, 2018</pre>
 */
//����������
@RunWith(Parameterized.class)
public class YearUtilsTest {

    private int input;//����
    private boolean expected;//�������

    public YearUtilsTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    //���ص�ֵ���ᱻ���ڹ��쵱ǰ������ �� new YearUtilsTest(2000,true);
    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                //��Ӧ���췽�����Ⱥ�˳�����룬���������
                {2000, true},
                {1900, false},
                {2004, true},
        });
    }

    /**
     * Method: isLeapYear(int y)
     */
    //ʹ�ö��Է�ʽ���в���
    @Test
    public void testIsLeapYear() throws Exception {
        assertEquals(expected, YearUtils.isLeapYear(input));

    }


} 
