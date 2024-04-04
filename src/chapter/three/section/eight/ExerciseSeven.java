/*
    问题：编写一个程序，模拟扔硬币的结果。
 */
package chapter.three.section.eight;

import java.util.Random;

/**
 * @author Raphael Cha
 */
public class ExerciseSeven {
    public static void main(String[] args) {
        int countA = 0, countB = 0;
        final int TIMES = 1000;

        for (int i = 0; i < TIMES; i++) {
            Random rand = new Random();
            int numberA = rand.nextInt(100);
            if (numberA < 50) {
                countA++;
            } else {
                countB++;
            }
        }
        System.out.println("一共抛了" + TIMES + "次硬币。");
        System.out.println("硬币正面向上的次数为：" + countA + "次。");
        System.out.println("硬币反面向上的次数为：" + countB + "次。");
    }
}
