/*
    问题：创建一个基类，它仅有一个非默认构造器；再创建一个导出类，它带有默认构造器
    和非默认构造器。在导出类的构造器中调用基类的构造器。
 */
package chapter.seven.section.two;

public class ExerciseEight extends BaseClass {
    ExerciseEight() {
        super(10);
        System.out.println("ExerciseEight default constructor");
    }

    ExerciseEight(int i) {
        super(i);
        System.out.println("ExerciseEight not default constructor");
    }

    public static void main(String[] args) {
        ExerciseEight test1 = new ExerciseEight();
        System.out.println();
        ExerciseEight test2 = new ExerciseEight(111);
    }
}

class BaseClass {
    BaseClass(int i) {
        System.out.println("BaseClass constructor:" + i);
    }
}
/*
输出：
    BaseClass constructor:10
    ExerciseEight default constructor

    BaseClass constructor:111
    ExerciseEight not default constructor

 */