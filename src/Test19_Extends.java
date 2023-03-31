public class Test19_Extends {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.sex();

    }
}


class Animal {
    String color;
    int leg;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    protected void sex() {
        System.out.println("SEX");
    }
}

class Cat extends Animal {
    public void sex() {
        super.sex();
    }
}

class Dog extends Animal {

}