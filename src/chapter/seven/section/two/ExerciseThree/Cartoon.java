/*
    问题：证明前面这句话（即使你不为Cartoon()创建构造器，编译器也会为你合成
    一个默认的构造器，该构造器将调用基类的构造器）。
 */
package chapter.seven.section.two.ExerciseThree;

public class Cartoon extends Drawing {
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}
/*
输出：
    Art constructor
    Drawing constructor

 */