/*
    问题：写一个程序，产生25个int类型的随机数。对于每个随机值，使用if-else语句来将
    其分类为大于、小于、或等于紧随它而随机生成的值。
 */
package chapter.four.section.three;

import java.util.Random;

/**
 * @author Raphael Cha
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ints = new int[25];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(100);
        }

        for (int value : ints) {
            System.out.print(value + " ");
        }
        System.out.println();

        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] > ints[i + 1]) {
                System.out.println("第" + (i + 1) + "个数大于第" + (i + 2) + "个数");
            } else if (ints[i] < ints[i + 1]) {
                System.out.println("第" + (i + 1) + "个数小于第" + (i + 2) + "个数");
            } else {
                System.out.println("第" + (i + 1) + "个数等于第" + (i + 2) + "个数");
            }
        }
    }
}
