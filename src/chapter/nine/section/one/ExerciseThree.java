/*
    问题：创建一个基类，让它包含抽象方法print()，并在导出类中覆盖该方法。覆盖后
    的方法版本可以打印导出类中定义的某个整型变量的值。在定义该变量之处，赋予它非零值。
    在基类的构造器中调用这个方法。现在，在main()方法中，创建一个导出类对象，然后调用它
    的print()方法。请解释发生的情形。
 */
package chapter.nine.section.one;

public class ExerciseThree {
    public static void main(String[] args) {
        OutputClass test = new OutputClass();
        test.print();
    }
}

abstract class BaseClass {
    abstract void print();

    BaseClass() {
        print();
    }
}

class OutputClass extends BaseClass {
    private int testNum = 39;

    @Override
    void print() {
        System.out.println("OutputClass.print() " + testNum);
    }
}
/*
输出：
    OutputClass.print() 0
    OutputClass.print() 39

总结：
    由于后期绑定，基类的构造器调用的print()方法是导出类中覆写的方法。但是由于类的构造
    顺序是从先构造基类，再构造导出类，所以在基类被构造时导出类中的testNum变量此时只是
    被加载，还未被初始化，因此输出的是testNum的默认值0。
 */