public class Test21_Abstract {
    public static void main(String[] args) {
        Cat21 cat = new Cat21("猫", 2);
        cat.eat();
    }
}

abstract class Animal21 {
    private String name;
    private int age;

    public Animal21() {
    }

    public Animal21(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

}

class Cat21 extends Animal21 {
    public Cat21() {
    }

    public Cat21(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(super.getName() + "吃鱼");
    }
}

