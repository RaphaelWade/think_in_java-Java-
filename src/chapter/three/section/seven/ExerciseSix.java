/*
    问题：在练习5的基础上，创建一个新的Dog索引，并对其赋值为spot对象。测试用==和
    equal()方法来比较所有引用的结果。
 */
package chapter.three.section.seven;

public class ExerciseSix {
    public static void main(String[] args) {
        Dog dogA = new Dog();
        Dog dogB = new Dog();
        Dog spot = new Dog();

        dogA.name = "spot";
        dogA.says = "Ruff!";
        dogB.name = "scruffy";
        dogB.says = "Wurf!";

        System.out.println(spot == dogA);
        System.out.println(spot == dogB);
        System.out.println(spot == spot);
        System.out.println(spot.equals(dogA));
        System.out.println(spot.equals(dogB));
        System.out.println(spot.equals(spot));
        /*
        输出：
            false
            false
            true
            false
            false
            true
         */
    }
}