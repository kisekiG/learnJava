public class Test14_Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.age = 23;
        student.gender = "男";
        student.study();
        student.sleep();
    }
}

class Student {
    String name;
    int age;
    String gender;

    public void study() {
        System.out.println("学生" + name + "学习");
    }

    public void sleep() {
        System.out.println("学生" + name + "睡觉");
    }
}