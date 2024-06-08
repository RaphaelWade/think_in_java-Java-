/*
    问题：证明接口中所有的方法都自动是public的。
 */
package chapter.nine.section.two;

public class ExerciseSix implements TestInterface {
    @Override
    public void testMethod1() {

    }

    @Override
    public void testMethod2() {

    }
    /*
        因为此类对TestInterface中的testMethod1()和testMethod2()方法的实现必须
        使用public修饰符修饰，所以说明TestInterface接口中的方法是自动public的。
    */
}

interface TestInterface {
    void testMethod1();

    void testMethod2();
}