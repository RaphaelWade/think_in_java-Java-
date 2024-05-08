/*
    问题：编写一个类，拥有两个静态字符串域，其中一个在定义处初始化，另一个在静态块中
    初始化。现在，加入一个静态方法用以打印出两个字段值。请证明它们都会在被使用之前完
    成初始化动作。
 */
package chapter.five.section.seven;

public class ExerciseFourteen {
    public static void main(String[] args) {
        System.out.println(StaticExercise.staticStringOne);
        System.out.println(StaticExercise.staticStringTwo);
        StaticExercise.printStrings();
    }
}

class StaticExercise {
    static String staticStringOne = "hello";
    static String staticStringTwo;

    static {
        staticStringTwo = "world";
    }

    static void printStrings() {
        System.out.println(staticStringOne + " " + staticStringTwo);
    }
}
/*
输出：
    hello
    world
    hello world

*/