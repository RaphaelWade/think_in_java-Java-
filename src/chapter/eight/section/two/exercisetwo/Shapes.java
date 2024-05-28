/*
    问题：在几何图形的示例中添加@Override注解。
 */
package chapter.eight.section.two.exercisetwo;

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

 */