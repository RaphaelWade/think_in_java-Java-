package chapter.two.section.two;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bigIntegerOne = new BigInteger("314159265123456789");
        BigInteger bigIntegerTwo = new BigInteger("123456789");

        // 基本运算
        System.out.println(bigIntegerOne.pow(5));
        /*
        计算bigIntegerOne的5次方
        结果为：3060196836381796531127475711126562361464436437726494528754640970776242563135261720482949
        */
        System.out.println(bigIntegerOne.subtract(bigIntegerTwo));
        /*
        计算bigIntegerOne与bigIntegerTwo的差
        结果为：314159265000000000
         */
        System.out.println(bigIntegerOne.add(bigIntegerTwo));
        /*
        计算bigIntegerOne与bigIntegerTwo的和
        结果为：314159265246913578
         */


        // 转化为基本类型：
        System.out.println(bigIntegerOne.longValue());
        /*
        转化为long类型
        结果为：314159265123456789
         */
        System.out.println(bigIntegerOne.intValue());
        /*
        转化为int类型
        结果为：-392898795
        注意：数值受到了影响
         */
//        System.out.println(bigIntegerOne.intValueExact());
        /*
        结果：java.lang.ArithmeticException: BigInteger out of int range
        注意：此时超出范围会直接抛出异常
         */
        System.out.println(bigIntegerOne.pow(30).floatValue());
        System.out.println(bigIntegerOne.pow(100).doubleValue());
        /*
        结果都是：Infinity
        注意：无floatValueExact()和doubleValueExact()方法
         */


        /*
        总结：
        1. BigInteger用于表示任意大小的整数；
        2. BigInteger继承自Number类；
        3. 将BigInteger类转化为byte、short、int、long时可以使用intValueExact()等，安全性更好；
        4. 将BigInteger类转化为float、double时如果超出范围会返回Infinity。
         */
    }
}
