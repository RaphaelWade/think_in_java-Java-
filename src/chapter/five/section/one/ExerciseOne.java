/*
    问题：创建一个类，它包含一个未初始化的String引用。验证该引用被Java初始化成了null。
 */
package chapter.five.section.one;

/**
 * @author Raphael Cha
 */
public class ExerciseOne {
    static String test;

    public static void main(String[] args) {
        System.out.println(test);
    }
}
/*
输出：
    null

 */