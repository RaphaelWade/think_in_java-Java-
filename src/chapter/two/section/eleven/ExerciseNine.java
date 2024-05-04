/*
    问题：编写一个程序，说明自动包装功能对所有的基本类型和包装器类型都起作用。
 */
package chapter.two.section.eleven;

/**
 * 如果本程序能成功运行，则说明自动包装功能对所有的基本类型和包装器类型都起作用。如果
 * 报错，则不能说明。
 *
 * @author Raphael Cha
 * @version 1.0
 * @since 1.9
 */
public class ExerciseNine {
    public static void main(String[] args) {
        System.out.println("如果这个程序能够正常运行，则说明：");
        System.out.println("所有基本类型都可以自动包装为包装器类型。");
        System.out.println("所有包装器类型都可以自动拆箱为基本类型。");
    }

    static void isBaseToWrapper() {
        boolean bool = false;
        char ch = 'c';
        byte bit = 2;
        short sh = 10;
        int intNumber = 100;
        long longNumber = 1000L;
        float f = 1.2f;
        double d = 25.6d;

        boolToBoolean(bool);
        charToCharacter(ch);
        byteToByte(bit);
        shortToShort(sh);
        intToInteger(intNumber);
        longToLong(longNumber);
        floatToFloat(f);
        doubleToDouble(d);
    }

    static void isWrapperToBase() {
        Boolean booleanObject = false;
        Character characterObject = 'f';
        Byte byteObject = 2;
        Short shortObject = 10;
        Integer integerObject = 100;
        Long longObject = 1000L;
        Float floatObject = 1.2f;
        Double doubleObject = 25.6d;

        boolean bool = booleanObject;
        char ch = characterObject;
        byte bit = byteObject;
        short sh = shortObject;
        int intNumber = integerObject;
        long longNumber = longObject;
        float f = floatObject;
        double d = doubleObject;
    }

    static void boolToBoolean(Boolean bool) {

    }

    static void charToCharacter(Character character) {

    }

    static void byteToByte(Byte bit) {

    }

    static void shortToShort(Short sh) {

    }

    static void intToInteger(Integer integer) {

    }

    static void longToLong(Long longObject) {

    }

    static void floatToFloat(Float f) {

    }

    static void doubleToDouble(Double d) {

    }
}
/*
输出：
    如果这个程序能够正常运行，则说明：
    所有基本类型都可以自动包装为包装器类型。
    所有包装器类型都可以自动拆箱为基本类型。

 */