/*
    补充自p68：实现书上ForEachInt类中的range()方法。
 */
package chapter.four.section.four;

import java.util.ArrayList;

/**
 * @author Raphael Cha
 * @version 1.0
 */
public class ForEachInt {
    /**
     * 作用：从0开始产生值，每次递增1，直至范围的上限，但不包括该上限。
     * @param maxLimit 范围的上限
     * @return ArrayList
     */
    public static ArrayList<Integer> range(int maxLimit) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < maxLimit - 1; i++) {
            arrayList.add(i + 1);
        }

        return arrayList;
    }

    /**
     * 作用：从指定范围的下限开始产生值，每次递增1.直至范围的上限，包括下限值，但不包括上限值。
     * @param minLimit 范围的下限
     * @param maxLimit 范围的上限
     * @return ArrayList
     */
    public static ArrayList<Integer> range(int minLimit, int maxLimit) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int j = minLimit; j < maxLimit; j++) {
            arrayList.add(j);
        }

        return arrayList;
    }

    /**
     * 作用：从指定范围的下限开始产生值，每次递增指定步进值，直至范围的上限，包括下限值，但不包括上限值。
     * @param minLimit 范围的下限
     * @param maxLimit 范围的上限
     * @param step 指定步进值
     * @return ArrayList
     */
    public static ArrayList<Integer> range(int minLimit, int maxLimit, int step) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int j = minLimit; j < maxLimit; j += step) {
            arrayList.add(j);
        }

        return arrayList;
    }

    public static void main(String[] args) {
        for (int value : range(10)) {
            System.out.print(value + " ");
        }
        System.out.println();

        for (int value : range(5, 10)) {
            System.out.print(value + " ");
        }
        System.out.println();

        for (int value : range(5, 20, 3)) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
/*
输出：
    1 2 3 4 5 6 7 8 9
    5 6 7 8 9
    5 8 11 14 17 

 */
