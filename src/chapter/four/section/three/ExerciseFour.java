/*
    问题：写一个程序，使用两个嵌套的for循环和取余操作符（%）来探测和打印素数（只能被其本身和1整除，而不能被其他数字整除的整数）。
 */
package chapter.four.section.three;

/**
 * @author Raphael Cha
 */
public class ExerciseFour {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int count = 0;

        for (int i = 2; i <= LIMIT; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                // 不是素数的情况
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            // 是素数的情况
            if (isPrimeNumber) {
                count++;
                System.out.print(i + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
/*
输出：
    2 3 5 7 11 13 17 19 23 29
    31 37 41 43 47 53 59 61 67 71
    73 79 83 89 97
 */