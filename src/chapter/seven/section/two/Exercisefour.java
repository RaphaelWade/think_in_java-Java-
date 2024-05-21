/*
    问题：证明基类构造器：（a）总是会被调用；（b）在导出类构造器之前被调用。
 */
package chapter.seven.section.two;

public class Exercisefour extends base {
    Exercisefour() {
        // 这里默认调用父类的构造器super()。
        System.out.println("ExerciseThree constructor");
    }

    public static void main(String[] args) {
        Exercisefour test = new Exercisefour();
    }
}

class base {
    base() {
        System.out.println("base constructor");
    }
}
/*
输出：
    base constructor
    ExerciseThree constructor

 */