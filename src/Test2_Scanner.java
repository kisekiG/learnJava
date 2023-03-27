import java.util.Scanner;

public class Test2_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //键盘录入练习
        System.out.println("请输入第一个整数：");
        int x = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int y = scanner.nextInt();

        int sum = x + y;
        System.out.println("sum = " + sum);

        int max = (x > y) ? x : y;
        System.out.println("max = " + max);

        boolean bo = (x == y) ? true : false;
        System.out.println("bo = " + bo);

        System.out.println("请输入第三个整数：");
        int z = scanner.nextInt();

        int maxx = (max > z) ? max : z;
        System.out.println("maxx = " + maxx);

    }

}
