/*
    问题：创建一个没有构造器的类，并在main()中创建其对象，用以验证编译器是否真的自动
    加入了默认构造器。
 */
package chapter.five.section.three;

/**
 * @author Raphael Cha
 */
public class ExerciseSeven {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.testString);
    }
}

class Test {
    String testString = "Successfully!";
}
/*
输出：
    Successfully!

 */