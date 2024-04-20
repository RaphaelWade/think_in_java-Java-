/*
    问题：修改前两个程序中的两个test()方法（p64和p69），让它们接受两个额外的参数
    begin和end，这样在测试testval时将判断它是否在begin和end之间（包括begin和end）
    的范围内。
 */
package chapter.four.section.five;

public class ExerciseSix {
    static int result = 0;

    static void test1(int testval, int target, int begin, int end) {
        if (testval < begin || testval > end) {
            System.out.print("你输入的测试数据越界了！请重新输入！");
            result = 404;
        } else {
            if (testval > target)
                result = +1;
            else if (testval < target)
                result = -1;
            else
                result = 0;
        }
    }

    static int test2(int testval, int target, int begin, int end) {
        if (testval < begin || testval > end) {
            System.out.print("你输入的测试数据越界了！请重新输入！");
            return 404;
        } else {
            if (testval > target)
                return +1;
            else if (testval < target)
                return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        test1(10, 5, 0, 20);
        System.out.println(result);
        test1(5, 10, 0, 20);
        System.out.println(result);
        test1(5, 5, 0, 20);
        System.out.println(result);
        test1(10,40,0,20);
        System.out.println(result);
        test1(30,40,0,20);
        System.out.println(result);
        System.out.println();

        System.out.println(test2(10, 5, 0, 20));
        System.out.println(test2(5, 10, 0, 20));
        System.out.println(test2(5, 5, 0, 20));
        System.out.println(test2(10,40,0,20));
        System.out.println(test2(30,40,0,20));
    }
}
/*
输出：
    1
    -1
    0
    -1
    你输入的测试数据越界了！请重新输入！404

    1
    -1
    0
    -1
    你输入的测试数据越界了！请重新输入！404

 */