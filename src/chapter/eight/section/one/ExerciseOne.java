/*
    问题：创建一个Cycle类，它具有子类Unicycle、Bicycle和Tricycle。演示每一个类型
    的实例都可以经由ride()方法向上转型为Cycle。
 */
package chapter.eight.section.one;

public class ExerciseOne {
    static void ride(Cycle cycle) {
        cycle.turn();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }
}

class Cycle {
    void turn() {
        System.out.println("Cycle.turn()");
    }
}

class Unicycle extends Cycle {
    void turn() {
        System.out.println("Unicycle.turn()");
    }
}

class Bicycle extends Cycle {
    void turn() {
        System.out.println("Bicycle.turn()");
    }
}

class Tricycle extends Cycle {
    void turn() {
        System.out.println("Tricycle.turn()");
    }
}
/*
输出：
    Unicycle.turn()
    Bicycle.turn()
    Tricycle.turn()

 */