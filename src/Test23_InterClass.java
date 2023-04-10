public class Test23_InterClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}

interface Inter {
    public abstract void show1();

    public abstract void show2();
}

class Outer {
    public void method() {
        new Inter() {
            public void show1() {
                System.out.println("show1");
            }

            public void show2() {
                System.out.println("show2");
            }
        }.show1();
    }
}