/*
    问题：在基类Shape.java中添加一个新方法，用于打印一条消息，但导出类中不要覆盖这个方法。请解释发生了什么。现在，
    在其中一个导出类中覆盖该新方法，而在其他的导出类中不予覆盖，观察又有什么发生。最后，在所有的导出类中覆盖这个方
    法。
*/
package chapter.eight.section.two.exercisethree;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.copy();
        }
    }
}
/*
1. 当导出类中不覆盖Shape类中新加的copy()方法时，输出:
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape

2. 只在Circle类中覆写copy()方法时，输出：
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the shape
Copy the circle

3. 在所有导出类中覆写copy()方法时，输出：
Copy the triangle
Copy the triangle
Copy the square
Copy the triangle
Copy the square
Copy the triangle
Copy the square
Copy the triangle
Copy the circle


总结：
    当导出类覆写了父类的某个可覆写的方法后，该导出类的实例对象调用该方法时，它会调用覆写后的方法，否则，调用会父类的
    该方法。
 */