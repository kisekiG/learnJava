public class Test22_InterFace {
    public static void main(String[] args) {
        JumpCat22 cat = new JumpCat22("花", 4);
        System.out.println(cat.getColor() + "..." + cat.getLeg());
        cat.eat();
        cat.sleep();
        cat.catchMouse();
        cat.jump();

        Dog22 dog = new Dog22("黑", 3);
        System.out.println(dog.getColor() + "..." + dog.getLeg());
        dog.eat();
        dog.sleep();
        dog.lookHome();

        /*Animal20 animal = new Cat20();
        animal.eat();*/
    }
}


abstract class Animal22 {
    private String color;
    private int leg;

    public Animal22() {
    }

    public Animal22(String color, int leg) {
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

    public abstract void eat();

    public abstract void sleep();

}

interface Jumping {
    public abstract void jump();
}

class Cat22 extends Animal20 {
    public Cat22() {
    }

    public Cat22(String color, int leg) {
        super(color, leg);
    }

    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void sleep() {
        System.out.println("猫睡觉");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class JumpCat22 extends Cat22 implements Jumping {
    public JumpCat22() {
    }

    public JumpCat22(String color, int leg) {
        super(color, leg);
    }

    public void jump() {
        System.out.println("猫跳");
    }
}

class Dog22 extends Animal22 {
    public Dog22() {
    }

    public Dog22(String color, int leg) {
        super(color, leg);
    }

    public void eat() {
        System.out.println("狗吃肉");
    }

    public void sleep() {
        System.out.println("狗睡觉");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}

class JumpDog22 extends Dog22 implements Jumping {
    public void jump() {
        System.out.println("狗跳");
    }
}