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
 * @since <pre>十二月 22, 2018</pre>
 */
//参数化测试
@RunWith(Parameterized.class)
public class YearUtilsTest {

    private int input;//输入
    private boolean expected;//期望输出

    public YearUtilsTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    //返回的值将会被用于构造当前测试类 即 new YearUtilsTest(2000,true);
    @Parameterized.Parameters
    public static Collection words() {
        return Arrays.asList(new Object[][]{
                //对应构造方法的先后顺序，输入，期望的输出
                {2000, true},
                {1900, false},
                {2004, true},
        });
    }

    /**
     * Method: isLeapYear(int y)
     */
    //使用断言方式进行测试
    @Test
    public void testIsLeapYear() throws Exception {
        assertEquals(expected, YearUtils.isLeapYear(input));

    }


} 
