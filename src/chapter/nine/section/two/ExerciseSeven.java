/*
    问题：修改第8章中的练习9，使Rodent成为一个接口。
 */
package chapter.nine.section.two;

public class ExerciseSeven {
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

interface Rodent {
    void eat();

    void sleep();
}

class Mouse implements Rodent {
    @Override
    public void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse.sleep()");
    }
}

class Gerbil implements Rodent {
    @Override
    public void eat() {
        System.out.println("Gerbil.eat()");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil.sleep()");
    }
}

class Hamster implements Rodent {
    @Override
    public void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    public void sleep() {
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