/*
    问题：编写一个具有两个常量值的程序，一个具有交替的二进制位1和0，其中最低有效位为0，
    另一个也具有交替的二进制位1和0，但是其最低有效位为1（提示：使用十六进制常量来表示
    是最简单的方法）。取这两个值，用按位操作符以所有可能的方式结合运算它们，然后用
    Integer.toBinaryString()显示。
 */
package chapter.three.section.ten;

public class ExerciseTen {
    public static void main(String[] args) {
        int numberA = 0xaaaaaaaa;
        int numberB = 0x55555555;

        System.out.println("numberA = " + Integer.toBinaryString(numberA));
        System.out.println("numberB = " + Integer.toBinaryString(numberB));
        System.out.println("numberA & numberB = " + Integer.toBinaryString(numberA & numberB));
        System.out.println("numberA | numberB = " + Integer.toBinaryString(numberA | numberB));
        System.out.println("numberA ^ numberB = " + Integer.toBinaryString(numberA ^ numberB));
        System.out.println("~numberA = " + Integer.toBinaryString(~numberA));
        System.out.println("~numberB = " + Integer.toBinaryString(~numberB));
    }
}
/*
    输出：
        numberA = 10101010101010101010101010101010
        numberB = 1010101010101010101010101010101
        numberA & numberB = 0
        numberA | numberB = 11111111111111111111111111111111
        numberA ^ numberB = 11111111111111111111111111111111
        ~numberA = 1010101010101010101010101010101
        ~numberB = 10101010101010101010101010101010
 */