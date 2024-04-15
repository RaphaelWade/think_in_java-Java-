/*
    问题：以一个所有位都为1的二进制数字开始，先左移它，然后用无符号右移操作符对其进行
    右移，直至所有的二进制位都被移出为止，每移一位都要使用Integer.toBinaryString()
    显示结果。
 */
package chapter.three.section.eleven;

/**
 * @author Raphael Cha
 */
public class ExerciseTwelve {
    public static void main(String[] args) {
        // 定义一个所有位都为1的二进制数字
        int numberA = 0xff;
        System.out.println(Integer.toBinaryString(numberA));

        // 将这个数字左移三位，并且每移一次都打印结果
        for (int i = 0; i < 3; i++) {
            numberA <<= 1;
            System.out.println(Integer.toBinaryString(numberA));
        }

        // 对这个数字进行无符号右移，直至所有二进制位都被移出为止
        while (numberA > 0) {
            System.out.println(Integer.toBinaryString(numberA >>>= 1));
        }
    }
}
/*
输出：
    11111111
    111111110
    1111111100
    11111111000
    1111111100
    111111110
    11111111
    1111111
    111111
    11111
    1111
    111
    11
    1
    0

 */