/*
    问题：创建一个不包含任何抽象方法的抽象类，并验证我们不能为该类创建任何实例。
 */
package chapter.nine.section.one;

public class ExerciseTwo {
    public static void main(String[] args) {
//        TestClass test = new TestClass(); // 无法通过编译，abstract类无法被实例化。
    }

    abstract class TestClass {
        void testMethod() {
        }
    }
}