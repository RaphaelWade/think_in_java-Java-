/*
    问题：创建一个简单的类。在第二个类中，将一个引用定义为第一个类的对象。运用
    惰性初始化来实例化这个对象。
 */
package chapter.seven.section.one;

public class ExerciseOne {
    static ExerciseOneTest test;

    public static void main(String[] args) {
        if (test == null) {
            test = new ExerciseOneTest();
        }
    }
}

class ExerciseOneTest {
    ExerciseOneTest() {
        System.out.println("ExerciseOneTest is created!");
    }
}
/*
输出：
    ExerciseOneTest is created!

 */