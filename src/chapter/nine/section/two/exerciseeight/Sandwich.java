/*
    在polymorphism.Sandwich.java（P158）中，创建接口FastFood并添加合适的方法，然后
    修改Sandwich以实现FastFood接口。
 */
package chapter.nine.section.two.exerciseeight;

public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        FastFood fastFood = new Sandwich();
        fastFood.getFat();
        fastFood.getHappy();
    }

    @Override
    public void getFat() {
        System.out.println("You will get fat if you won't stop!");
    }

    @Override
    public void getHappy() {
        System.out.println("You will get happy if you do this!");
    }
}

interface FastFood {
    void getFat();

    void getHappy();
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}
/*
输出：
    Meal()
    Lunch()
    PortableLunch()
    Bread()
    Cheese()
    Lettuce()
    Sandwich()
    You will get fat if you won't stop!
    You will get happy if you do this!

 */