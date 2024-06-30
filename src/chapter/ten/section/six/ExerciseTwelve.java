/*
    问题：重复练习7，这次使用匿名内部类。
 */
package chapter.ten.section.six;

public class ExerciseTwelve {
    private String name = "Raphael";

    private void sayHello() {
        System.out.println("Hello!" + name + "!");
    }

    Inner Change() {
        return new Inner() {
            @Override
            public void changeOuterFieldAndCallOuterMethod(String newName) {
                name = newName;
                sayHello();
            }
        };
    }

    public static void main(String[] args) {
        ExerciseTwelve outer = new ExerciseTwelve();

        outer.Change().changeOuterFieldAndCallOuterMethod("Jack");
    }
}

interface Inner {
    void changeOuterFieldAndCallOuterMethod(String newName);
}

/*
输出：
    Hello!Jack!

 */