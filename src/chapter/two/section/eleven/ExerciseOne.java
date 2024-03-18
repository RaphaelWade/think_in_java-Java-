/*
    问题：创建一个类，它包含一个int域和一个char域，它们都没有被初始化，将他们的值打印出来，
以验证Java执行了默认初始化。
 */
package chapter.two.section.eleven;

public class ExerciseOne {
    static int VariableOne;
    static char VariableTwo;

    public static void main(String[] args) {
        System.out.println("VariableOne = " + VariableOne);
        // 0
        System.out.println("VariableTwo = " + VariableTwo);
        // null
    }
}
