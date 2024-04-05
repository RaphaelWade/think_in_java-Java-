/*
    问题：展示用十六进制和八进制计数法来操作long值，用Long.toBinaryString()来
    显示结果。
 */
package chapter.three.section.nine;

public class ExerciseEight {
    public static void main(String[] args) {
        long numberA = 0x64L; // 十进制为100
        long numberB = 0144L; // 十进制为100

        System.out.println(Long.toBinaryString(numberA));
        System.out.println(Long.toBinaryString(numberB));
    }
}
/*
    输出：
        1100100
        1100100
 */