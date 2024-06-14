/*
    问题：创建一个类，它持有一个String，并且有一个显示这个String的toString()方法。
    将你的新类的若干个对象添加到一个Sequence对象中，然后显示它们。
 */
package chapter.ten.section.two.exercisetwo;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        TestClass test1 = new TestClass("Raphael");
        TestClass test2 = new TestClass("Frank");
        TestClass test3 = new TestClass("Lily");

        Sequence sequence = new Sequence(3);
        sequence.add(test1.toString());
        sequence.add(test2.toString());
        sequence.add(test3.toString());
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class TestClass {
    String name;

    TestClass(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
/*
输出：
    Raphael
    Frank
    Lily

 */