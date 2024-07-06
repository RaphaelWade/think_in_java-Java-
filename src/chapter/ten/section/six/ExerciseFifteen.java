/*
    问题：创建一个类，它有非默认的构造器（即需要参数的构造器），并且没有默认构造
    器（没有无参数的构造器）。创建第二个类，它包含一个方法，能够返回对第一个类的对象的引
    用。通过写一个继承自第一个类的匿名内部类，来创建一个返回对象。
 */
package chapter.ten.section.six;

public class ExerciseFifteen {
    public static void main(String[] args) {
        TheSecondClass theSecondClass = new TheSecondClass();
        theSecondClass.getTheFirstClass("Raphael");
    }
}

class TheFirstClass {
    TheFirstClass(String name) {
        sayHello();
        System.out.println(name + ", this is the first class.");
    }

    void sayHello() {
        System.out.println("Hello!");
    }
}

class TheSecondClass {
    TheFirstClass getTheFirstClass(String name) {
        return new TheFirstClass(name) {
            @Override
            void sayHello() {
                System.out.println("你好！");
            }
        };
    }
}
/*
输出：
    你好！
    Raphael, this is the first class.

 */