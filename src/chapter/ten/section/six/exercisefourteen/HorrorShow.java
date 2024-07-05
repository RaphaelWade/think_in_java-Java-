/*
    问题：修改interface/HorrorShow.java（P180），用匿名类实现DangerousMonster和Vampire。
 */
package chapter.ten.section.six.exercisefourteen;

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d){
        d.menace();
        d.destroy();
    }

    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        u(new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("Dangerous monster is destroying!");
            }

            @Override
            public void menace() {
                System.out.println("Dangerous monster is menacing!");
            }
        });
        v(new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("Dangerous monster is destroying!");
            }

            @Override
            public void menace() {
                System.out.println("Dangerous monster is menacing!");
            }
        });

        u(new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Vampire is drinking blood!");
            }

            @Override
            public void destroy() {
                System.out.println("Vampire is destroying!");
            }

            @Override
            public void kill() {
                System.out.println("Vampire is killing!");
            }

            @Override
            public void menace() {
                System.out.println("Vampire is menacing!");
            }
        });
        v(new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Vampire is drinking blood!");
            }

            @Override
            public void destroy() {
                System.out.println("Vampire is destroying!");
            }

            @Override
            public void kill() {
                System.out.println("Vampire is killing!");
            }

            @Override
            public void menace() {
                System.out.println("Vampire is menacing!");
            }
        });
        w(new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Vampire is drinking blood!");
            }

            @Override
            public void destroy() {
                System.out.println("Vampire is destroying!");
            }

            @Override
            public void kill() {
                System.out.println("Vampire is killing!");
            }

            @Override
            public void menace() {
                System.out.println("Vampire is menacing!");
            }
        });
    }
}

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

/*
输出：
    Dangerous monster is menacing!
    Dangerous monster is menacing!
    Dangerous monster is destroying!
    Vampire is menacing!
    Vampire is menacing!
    Vampire is destroying!
    Vampire is killing!

 */