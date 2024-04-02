/*
    问题：创建一个名为Dog的类，它包含两个String域：name和says。在main()方法中，
    创建两个Dog对象，一个名为spot（它的叫声为“Ruff！”），另一个名为scruffy（它
    的叫声为“Wurf！”）。然后显示它们的名字和叫声。
 */
package chapter.three.section.seven;

public class ExerciseFive {
    public static void main(String[] args) {
        Dog dogA = new Dog();
        Dog dogB = new Dog();

        dogA.name = "spot";
        dogA.says = "Ruff!";
        dogB.name = "scruffy";
        dogB.says = "Wurf!";

        System.out.println(dogA.name + "'s bark is " + dogA.says);
        System.out.println(dogB.name + "'s bark is " + dogB.says);
    }
    /*
    输出：
        spot's bark is Ruff!
        scruffy's bark is Wurf!
     */
}

class Dog {
    String name;
    String says;
}