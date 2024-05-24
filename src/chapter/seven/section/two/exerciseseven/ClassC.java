/*
    问题：修改练习5，使A和B以带参数的构造器取代默认的构造器。为C写一个构造器，并在
    其中执行所有的初始化。
 */
package chapter.seven.section.two.exerciseseven;

public class ClassC extends ClassA {
    ClassC() {
        super(1);
        System.out.println("ClassC constructor");
        ClassB classB = new ClassB(10);
    }

    public static void main(String[] args) {
        ClassC test = new ClassC();
    }
}

class ClassA {
    ClassA(int i) {
        System.out.println("ClassA constructor");
    }
}

class ClassB {
    ClassB(int i) {
        System.out.println("ClassB constructor");
    }
}
/*
输出：
    ClassA constructor
    ClassC constructor
    ClassB constructor

 */