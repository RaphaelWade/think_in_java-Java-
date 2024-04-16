/*
    问题：编写一个方法，它以二进制形式显示char类型的值。使用多个不同的字符来展示它。
 */
package chapter.three.section.eleven;

/**
 * @author Raphael Cha
 */
public class ExerciseThirteen {
    public static void main(String[] args) {
        char varA = 'a';
        char varB = 'b';
        char varC = 'c';

        charToBinaryString(varA);
        charToBinaryString(varB);
        charToBinaryString(varC);
    }

    /**
     * 作用：将指定char类型的值以它的二进制形式输出
     * @param var 指定的要操作的char类型的值
     */
    public static void charToBinaryString(char var) {
        // 输出的是该字符的Unicode码的二进制形式。
        System.out.println(Integer.toBinaryString(var));
    }
}
/*
输出：
    1100001
    1100010
    1100011

 */