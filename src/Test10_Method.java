import java.util.Scanner;

public class Test10_Method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int b = scanner.nextInt();
        int sum = add(a, b);
        System.out.println("sum = " + sum);
        int max = Max(a, b);
        System.out.println("max = " + max);
        boolean equal = isEquals(a, b);
        System.out.println("equal = " + equal);

        System.out.println("请输入行数：");
        int row = scanner.nextInt();
        System.out.println("请输入列数：");
        int column = scanner.nextInt();
        print(row, column);

        System.out.println("请输入一个整数：");
        int prnumber = scanner.nextInt();
        printNumber(prnumber);

    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int Max(int a, int b) {

        int max = (a >= b) ? a : b;
        return max;
    }

    public static boolean isEquals(int a, int b) {
        return a == b;
    }

    public static void print(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printNumber(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + '\t');
            }
            System.out.println();
        }
    }
}
