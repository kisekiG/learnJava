public class Test20_Animal {
    public static void main(String[] args) {
        Cat20 cat = new Cat20("花", 4);
        System.out.println(cat.getColor() + "..." + cat.getLeg());
        cat.eat();
        cat.catchMouse();

        Dog20 dog = new Dog20("黑", 3);
        System.out.println(dog.getColor() + "..." + dog.getLeg());
        dog.eat();
        dog.lookHome();

        Animal20 animal = new Cat20();
        animal.eat();

    }
}

class Animal20 {
    private String color;
    private int leg;

    public Animal20() {
    }

    public Animal20(String color, int leg) {
        this.color = color;
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}

class Cat20 extends Animal20 {
    public Cat20() {
    }

    public Cat20(String color, int leg) {
        super(color, leg);
    }

    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog20 extends Animal20 {
    public Dog20() {
    }

    public Dog20(String color, int leg) {
        super(color, leg);
    }

    public void eat() {
        System.out.println("狗吃肉");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}
