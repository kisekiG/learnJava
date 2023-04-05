public class Test17_Employee {
    public static void main(String[] args) {
        Coder coder = new Coder("程序员", "007", 10000.64);
        coder.work();
        Manager manager = new Manager("项目经理", "001", 50000.99, 30000);
        manager.work();
    }
}

abstract class Employee {
    private String name, id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

}

class Coder extends Employee {
    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("我的姓名：" + this.getName() + "，我的工号是：" + this.getId() + "，我的工资是：" + this.getSalary() + "，我的工作内容是敲代码");
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("我的姓名：" + this.getName() + "，我的工号是：" + this.getId() + "，我的工资是：" + this.getSalary() + "，我的奖金是" + this.bonus + "，我的工作内容是管理项目");
    }
}