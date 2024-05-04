/*
    问题：编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类中的某个特定的
    static域只有一个实例。
 */
package chapter.two.section.eleven;

/**
 * @author Raphael Cha
 */
public class ExerciseEight {
    static int countObject = 0;

    ExerciseEight() {
        countObject++;
        System.out.println("这是你创建的第" + countObject + "个对象。");
    }

    public static void main(String[] args) {
        ExerciseEight objectOne = new ExerciseEight();
        ExerciseEight objectTwo = new ExerciseEight();
        ExerciseEight objectThree = new ExerciseEight();
    }
}
/*
输出：
    这是你创建的第1个对象。
    这是你创建的第2个对象。
    这是你创建的第3个对象。

 */