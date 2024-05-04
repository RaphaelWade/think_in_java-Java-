/*
    问题：编写具有两个方法的类，在第一个方法内调用第二个方法两次：第一次调用时不使用
    this关键字，第二次调用时使用this关键字——这里只是为了验证它是起作用的，你不应该
    在实践中使用这种方式。
 */
package chapter.five.section.four;

import org.junit.Test;

/**
 * @author Raphael Cha
 */
public class ExerciseEight {
    @Test
    public void run() {
        testMethod();
        this.testMethod();
    }

    void testMethod() {
        System.out.println("This is just a test!");
    }
}
/*
输出：
    This is just a test!
    This is just a test!

 */