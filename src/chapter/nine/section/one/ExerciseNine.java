/*
    问题：修改第8章练习9中的Rodent，使其成为一个抽象类。只要有可能，就将Rodent
    的方法声明为抽象方法。
 */
package chapter.nine.section.one;

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

abstract class Rodent {
    abstract void eat();

    abstract void sleep();
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