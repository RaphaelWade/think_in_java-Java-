/*
    问题：修改练习2，把代码用一个while无限循环包括起来。然后运行它直至用键盘中断其运行（通常是通过按Ctrl-C）。
 */
package chapter.four.section.three;

import java.util.Random;

/**
 * @author Raphael Cha
 */
public class ExerciseThree {
    public static void main(String[] args) {
        Random rand = new Random();
        final int LIMIT = 10000000;
        int[] ints = new int[LIMIT];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(100);
        }

        int i = 0;
        try {
            while (true) {
                if (ints[i] > ints[i + 1]) {
                    System.out.println("第" + (i + 1) + "个数大于第" + (i + 2) + "个数");
                } else if (ints[i] < ints[i + 1]) {
                    System.out.println("第" + (i + 1) + "个数小于第" + (i + 2) + "个数");
                } else {
                    System.out.println("第" + (i + 1) + "个数等于第" + (i + 2) + "个数");
                }
                i++;
            }
        } catch (Exception e) {

        }
    }
}
