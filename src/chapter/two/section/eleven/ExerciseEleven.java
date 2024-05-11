/*
    问题：将AllTheColorOfTheRainbow这个示例改写成一个程序，然后编译、运行。
 */
package chapter.two.section.eleven;

public class ExerciseEleven {
    public static void main(String[] args) {
        AllTheColorOfTheRainbow test = new AllTheColorOfTheRainbow();
        System.out.println("test.anIntegerRepresentingColors = " + test.anIntegerRepresentingColors);
        test.changeTheHueOfTheColor(10);
    }
}

class AllTheColorOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        System.out.println("New hue is " + newHue);
    }
}
/*
输出：
    test.anIntegerRepresentingColors = 0
    New hue is 10

 */