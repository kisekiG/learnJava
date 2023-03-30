public class Test17_Employee {
    public static void main(String[] args) {
        Employee employee = new Employee("令狐冲", "9527", 2000);
        employee.work();
    }
}

class Employee {
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

    public void work() {
        System.out.println("我的姓名：" + name + "，我的工号是：" + id + "，我的工资是：" + salary + "，我的工作内容是敲代码");
    }
}
