/*
    问题：修改本章练习1，通过使用break关键词，使得程序打印到99时退出。然后尝试使用return来达到相同的目的。
 */
package chapter.four.section.six;

/**
 * @author Raphael Cha
 */
public class ExerciseSeven {
    public static void main(String[] args) {
        // 变量i如果不定义在for循环的初始化表达式的位置，则必须定义在for循坏的外部。
        int i = 0;

        // 编译器将while(true)和for(;;)看作同一回事。
        for (; ; ) {
            i++;
            System.out.print(i + " ");
            if (i % 25 == 0)
                System.out.println();
            if (i == 99)
//                break;
                return;
        }
    }
}
/*
输出：
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
    51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75
    76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
 */