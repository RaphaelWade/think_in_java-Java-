/*
    补充自P56：
        1. 如果对基本数据类型执行算数运算或位运算，大家会发现，只要类型比int小（即char
        、byte或者short），那么在运算之前，这些值会自动转换成int。
        2. 如果想把结果赋值给较小的类型，就必须使用类型转换。
        3. 通常，表达式中出现的最大的数据类型决定了表达式最终结果的数据类型。
 */
package chapter.three.section.fifteen;

import chapter.three.section.five.UnaryPlusExtension;

/**
 * @author Raphael Cha
 */
public class TypeAutomaticPromoteTest {
    public static void main(String[] args) {
        short numberA = 10;
        byte numberB = 5;

        // 比int小的类型，进行算术运算后自动转化为int类型。
        System.out.println(UnaryPlusExtension.getType(numberA * numberB));


        // 如果想把结果赋值给较小的类型，就必须使用类型转换。否则报错。
//        short numberC = numberA * numberB;


        float numberC = 10.0f;
        double numberD = 2.0D;

        // 通常，表达式中出现的最大的数据类型决定了表达式最终结果的数据类型。
        System.out.println(UnaryPlusExtension.getType(numberC * numberD));
    }
}
/*
输出：
    class java.lang.Integer
    class java.lang.Double

 */