/*
    创建一个不包含任何方法的抽象类，从它那里导出一个类，并添加一个方法。
    创建一个静态方法，它可以接受指向基类的引用，将其向下转型到导出类，然后再调用该静态
    方法。在main()中，展现它的运行情况。然后，为基类中的方法加上abstract声明，这样就不再
    需要进行向下转型。
 */
package chapter.nine.section.one;

public class ExerciseFour {
    static void transform(BaseTestClass baseClass) {
        ((OutputTestClass)baseClass).testMethod();
    }

    public static void main(String[] args) {
        transform(new OutputTestClass());
    }
}

abstract class BaseTestClass {
//    void testMethod() {
//        System.out.println("BaseTestClass.testMethod()");
//    }
    abstract void testMethod();
}

class OutputTestClass extends BaseTestClass {
    @Override
    void testMethod() {
        System.out.println("OutputTestClass.testMethod()");
    }
}
/*
第一种输出：
    BaseTestClass.testMethod()

第二种输出：
    OutputTestClass.testMethod()

解释：
    前一种情况是因为子类继承了父类的方法，但并未重写，因此调用的是父类的方法。后一种
    情况是因为子类重写了父类的抽象方法，因此调用的是重写后的方法。
 */