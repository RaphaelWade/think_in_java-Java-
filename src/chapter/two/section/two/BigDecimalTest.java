/*
    补充自P23：Java提供了用于高精度计算的类：BigInteger和BigDecimal。
 */
package chapter.two.section.two;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    @Test
    public void test1() {
        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd)); // 15241.55677489
    }

    @Test
    public void test2() {
        // BigDecimal用scale()表示小数位数
        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.4500");
        BigDecimal d3 = new BigDecimal("1234500");
        System.out.println(d1.scale()); // 2,两位小数
        System.out.println(d2.scale()); // 4
        System.out.println(d3.scale()); // 0
    }

    @Test
    public void test3() {
        // 通过BigDecimal的stripTrailingZeros()方法，可以将一个BigDecimal格式化为一个相等的，但去掉了末尾0的BigDecimal：
        BigDecimal d1 = new BigDecimal("123.4500");
        BigDecimal d2 = d1.stripTrailingZeros();
        System.out.println(d1.scale()); // 4
        System.out.println(d2.scale()); // 2,因为去掉了00

        BigDecimal d3 = new BigDecimal("1234500");
        BigDecimal d4 = d3.stripTrailingZeros();
        System.out.println(d3.scale()); // 0
        System.out.println(d4.scale()); // -2
        // 注意：如果一个BigDecimal的scale()返回负数，表示这个数是个整数
    }

    @Test
    public void test4() {
        // 可以对一个BigDecimal设置它的scale
        BigDecimal d1 = new BigDecimal("123.456789");
        BigDecimal d2 = d1.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
        BigDecimal d3 = d1.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
        System.out.println(d2);
        System.out.println(d3);
    }

    @Test
    public void test5() {
        BigDecimal d1 = new BigDecimal("123.456");
        BigDecimal d2 = new BigDecimal("23.456789");
        BigDecimal d3 = d1.divide(d2, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
//        BigDecimal d4 = d1.divide(d2); // 报错：ArithmeticException，因为除不尽

        System.out.println(d3);
    }

    @Test
    public void test6() {
        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 102
        System.out.println(dr[1]); // 0.105
    }

    @Test
    public void test7() {
        BigDecimal n = new BigDecimal("12.75");
        BigDecimal m = new BigDecimal("0.15");
        BigDecimal[] dr = n.divideAndRemainder(m);
        if (dr[1].signum() == 0) {
            // n是m的整数倍
            System.out.println("n是m的整数倍");
        }
    }

    @Test
    public void test8() {
        // 应该使用compareTo()比较两个BigDecimal的值，不要使用equals()！
        BigDecimal d1 = new BigDecimal("123.456");
        BigDecimal d2 = new BigDecimal("123.45600");
        System.out.println(d1.equals(d2)); // false,因为scale不同
        System.out.println(d1.equals(d2.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为3
        System.out.println(d1.compareTo(d2)); // 0
    }
}
/*
    声明：所有代码皆摘自https://www.liaoxuefeng.com/wiki/1252599548343744/1279768011997217
    如有侵权，请联系我。
 */