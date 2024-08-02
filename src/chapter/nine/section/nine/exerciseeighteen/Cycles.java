/*
    问题：创建一个Cycle接口及其Unicycle、Bicycle和Tricycle实现。对每种类型的Cycle
    都创建相应的工厂，然后编写代码使用这些工厂。
 */
package chapter.nine.section.nine.exerciseeighteen;

public class Cycles {
    public static void rideCycles(CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycles(new GetBicycle());
        rideCycles(new GetUnicycle());
        rideCycles(new GetTricycle());
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
}

class GetUnicycle implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Ride the bicycle.");
    }
}

class GetBicycle implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Ride the Tricycle.");
    }
}

class GetTricycle implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
/*
输出：
    Ride the bicycle.
    Ride the unicycle.
    Ride the Tricycle.

 */