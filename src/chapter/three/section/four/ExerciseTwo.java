/*
    问题：创建一个包含一个float域的类，并用这个类来展示别名机制。
 */
package chapter.three.section.four;

public class ExerciseTwo {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();

        tank1.testNumber = 2.5f;
        tank2.testNumber = 10.5f;
        System.out.println("1.tank1.testNumber = " + tank1.testNumber + ", tank2.testNumber = " + tank2.testNumber);

        tank1 = tank2; // 别名机制（tank2被赋给tank1后，就丢失了，会被回收）
        System.out.println("2.tank1.testNumber = " + tank1.testNumber + ", tank2.testNumber = " + tank2.testNumber);

        tank1.testNumber = 25.5f;
        System.out.println("3.tank1.testNumber = " + tank1.testNumber + ", tank2.testNumber = " + tank2.testNumber);

        /*
        输出：
            1.tank1.testNumber = 2.5, tank2.testNumber = 10.5
            2.tank1.testNumber = 10.5, tank2.testNumber = 10.5
            3.tank1.testNumber = 25.5, tank2.testNumber = 25.5
         */
    }
}

class Tank{
    float testNumber;
}