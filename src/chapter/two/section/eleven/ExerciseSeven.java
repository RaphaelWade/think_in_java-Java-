/*
    问题：将Incrementable的代码段（p30）改写成一个完整的可运行程序。
 */
package chapter.two.section.eleven;

/**
 * @author Raphael Cha
 */
public class ExerciseSeven {
    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
/*
输出：
    48

 */