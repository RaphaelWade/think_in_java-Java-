/*
    问题：编写一个计算速度的程序，它所使用的距离和时间都是常量。
 */
package chapter.three.section.five;

public class ExerciseFour {
    public static void main(String[] args) {
        final float DISTANCE = 100.0f;
        final float TIME = 25.0f;

        System.out.println("计算出的速度为：" + DISTANCE / TIME);
        /*
        输出：
            计算出的速度为：4.0
         */
    }
}
