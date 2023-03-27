import java.util.Scanner;

public class Test3_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("请输入学生成绩范围在1到100之间");
        int x = scanner.nextInt();

        if (x >= 90 && x <= 100) {
            System.out.println("优");
        } else if (x >= 80 && x <= 89) {
            System.out.println("良");
        } else if (x >= 70 && x <= 79) {
            System.out.println("中");
        } else if (x >= 60 && x <= 69) {
            System.out.println("及");
        } else if (x >= 0 && x <= 59) {
            System.out.println("差");
        } else {
            System.out.println("成绩录入错误");
        }*/

        System.out.println("请输入一个整数：");
        int x = scanner.nextInt();
        int y;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x > -1 && x < 3) {
            y = 2 * x;
        } else if (x <= -1) {
            y = 2 * x - 1;
        } else {
            y = 0;
        }
        System.out.println("y = " + y);

    }

}
