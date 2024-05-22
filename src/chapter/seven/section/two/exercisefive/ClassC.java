/*
    问题：创建两个带有默认构造器（空参列表）的类A和类B。从A中继承产生一个名为C的新
    类，并在C内创建一个B类的成员。不要给C编写构造器。创建一个C类的对象并观察其结果
    。
 */
package chapter.seven.section.two.exercisefive;

public class ClassC extends ClassA {
    ClassB classB = new ClassB();

    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}

class ClassA {
    ClassA() {
        System.out.println("ClassA constructor");
    }
}

class ClassB {
    ClassB() {
        System.out.println("ClassB constructor");
    }
}
/*
输出：
    ClassA constructor
    ClassB constructor

 */