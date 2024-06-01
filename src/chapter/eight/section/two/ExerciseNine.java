/*
    问题：创建Rodent（啮齿动物）：Mouse（老鼠），Gerbil（鼹鼠），Hamster（大颊鼠），
    等等这样一个的继承层次结构。在基类中，提供对所有的Rodent都通用的方法，在导出类中，
    根据特定的Rodent类型覆盖这些方法，以便它们执行不同的行为。创建一个Rodent数组，填充
    不同的Rodent类型，然后调用基类方法，观察发生什么情况。
 */
package chapter.eight.section.two;

public class ExerciseNine {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };

        for (Rodent value : rodents) {
            value.eat();
            value.sleep();
        }
    }
}

class Rodent {
    void eat() {
        System.out.println("Rodent.eat()");
    }

    void sleep() {
        System.out.println("Rodent.sleep()");
    }
}

class Mouse extends Rodent {
    @Override
    void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    void sleep() {
        System.out.println("Mouse.sleep()");
    }
}

class Gerbil extends Rodent {
    @Override
    void eat() {
        System.out.println("Gerbil.eat()");
    }

    @Override
    void sleep() {
        System.out.println("Gerbil.sleep()");
    }
}

class Hamster extends Rodent {
    @Override
    void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    void sleep() {
        System.out.println("Hamster.sleep()");
    }
}
/*
输出：
    Mouse.eat()
    Mouse.sleep()
    Gerbil.eat()
    Gerbil.sleep()
    Hamster.eat()
    Hamster.sleep()

 */