/*
    问题：修改第9章中练习18的解决方案，让它使用匿名内部类。
 */
package chapter.ten.section.six.exercisesixteen;

public class Cycles {
    public static void rideCycles(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycles(Bicycle.factory);
        rideCycles(Unicycle.factory);
        rideCycles(Tricycle.factory);
    }
}

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Ride the unicycle.");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Ride the bicycle.");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Ride the Tricycle.");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}
/*
输出：
    Ride the bicycle.
    Ride the unicycle.
    Ride the Tricycle.

 */