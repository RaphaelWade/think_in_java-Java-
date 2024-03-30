/*
    问题：创建一个包含一个float域的类，并用这个类来展示方法调用时的别名机制。
 */
package chapter.three.section.four;

public class ExerciseThree {
    static void function(TestClass y) {
        y.testNumber = 25.5f;
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        testClass.testNumber = 5.6f;
        System.out.println("1.testClass.testNumber = " + testClass.testNumber);

        function(testClass); // testClass引用指向了y，原对象被回收。
        System.out.println("2.testClass.testNumber = " + testClass.testNumber);

        /*
        输出：
            1.testClass.testNumber = 5.6
            2.testClass.testNumber = 25.5
         */
    }
}

class TestClass {
    float testNumber;
}