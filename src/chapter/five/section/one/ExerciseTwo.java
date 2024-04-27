/*
    问题：创建一个类，它包含一个在定义时就被初始化了的String域，以及另一个通过构造器初始化的String域。这两种方式有何差异？
 */
package chapter.five.section.one;

public class ExerciseTwo {
    static String stringA = "hello!";

    ExerciseTwo(String stringB) {
        System.out.println("定义类时就被初始化了的String域是固定的：" + stringA);
        System.out.println("通过构造函数初始化的String域不是固定的，是由用户实例化类时自定义的：" + stringB);
    }

    public static void main(String[] args) {
        ExerciseTwo testA = new ExerciseTwo("Free!");
        System.out.println();
        ExerciseTwo testB = new ExerciseTwo("Random!");
    }
}
/*
输出：
    定义类时就被初始化了的String域是固定的：hello!
    通过构造函数初始化的String域不是固定的，是由用户实例化类时自定义的：Free!

    定义类时就被初始化了的String域是固定的：hello!
    通过构造函数初始化的String域不是固定的，是由用户实例化类时自定义的：Random!

 */