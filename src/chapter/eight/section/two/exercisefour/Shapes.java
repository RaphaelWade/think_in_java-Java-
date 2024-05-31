/*
    问题：向Shapes.java中添加一个新的Shape类型，并在main()方法中验证：多态对新类型
    的作用是否在与旧类型中的一样。
 */
package chapter.eight.section.two.exercisefour;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
        }

        System.out.println();
        Shape testObject = new Circle();
        testObject.draw();
        testObject.erase();
    }
}
/*
输出：
    Triangle.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Square.draw()
    Triangle.draw()
    Circle.draw()

    Circle.draw()
    Circle.erase()

 */