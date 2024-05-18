/*
    问题：从Detergent中继承产生一个新的类。覆盖scrub()并添加一个名为sterilize()
    的新方法。
 */
package chapter.seven.section.two;

public class ExerciseTwo extends Detergent {
    public void scrub() {
        append(" ExerciseTwo.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        ExerciseTwo x = new ExerciseTwo();
        System.out.println("Testing class ExerciseTwo:");
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        System.out.println("Testing class Detergent:");
        Detergent.main(args);
    }
}

class Cleanser {
    private String s = "Cleaner";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser {
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
/*
输出：
    Testing class ExerciseTwo:
    Cleaner dilute() apply() ExerciseTwo.scrub() Detergent.scrub() scrub() foam() sterilize()
    Testing class Detergent:
    Cleaner dilute() apply() Detergent.scrub() scrub() foam()
    Testing base class:
    Cleaner dilute() apply() scrub()

 */