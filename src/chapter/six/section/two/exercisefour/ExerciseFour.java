/*
    问题：展示protected方法具有包访问权限，但不是public。
 */
package chapter.six.section.two.exercisefour;

public class ExerciseFour {
    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }
}
/*
输出：
    protected方法具有包访问权限！

 */