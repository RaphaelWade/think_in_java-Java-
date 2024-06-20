/*
    问题：创建一个含有private域和private方法的类。创建一个内部类，它有一个方法可
    用来修改外围类的域，并调用外围类的方法。在外围类的另一方法中，创建此内部类的对象，
    并且调用它的方法，然后说明对外围类对象的影响。
 */
package chapter.ten.section.four;

public class ExerciseSeven {
    private String name = "Raphael";

    private void sayHello() {
        System.out.println("Hello!" + name + "!");
    }

    private class InnerClass {
        void changeOuterFieldAndCallOuterMethod(String newName) {
            name = newName;
            sayHello();
        }
    }

    public static void main(String[] args) {
        ExerciseSeven outer = new ExerciseSeven();
        InnerClass inner = outer.new InnerClass();
        inner.changeOuterFieldAndCallOuterMethod("Jack");
    }
}
/*
总结：
    1. 内部类可以直接调用外部类的private字段和private方法。
    2. 内部类可以直接修改外部类的private可变字段。

输出：
    Hello!Jack!

 */