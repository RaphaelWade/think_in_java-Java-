/*
    问题：以一个最高有效位为1的二进制数字开始（提示：使用十六进制常量），用有符号
    右移符对其进行右移，直至所有的二进制位都被移出为止，每移一位都要使用Integer.
    toBinaryString()显示结果。
 */
package chapter.three.section.eleven;

public class ExerciseEleven {
    public static void main(String[] args) {
        short numberA = 0x80;
        System.out.println(Integer.toBinaryString(numberA));

        while (numberA > 0) {
            System.out.println(Integer.toBinaryString(numberA >>= 1));
        }
    }
}
/*
    输出：
        10000000
        1000000
        100000
        10000
        1000
        100
        10
        1
        0

 */