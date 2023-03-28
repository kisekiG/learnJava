import java.util.Scanner;

public class Test11_overload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        double aa = scanner.nextDouble();
        System.out.println("请输入第二个数：");
        int b = scanner.nextInt();
        double bb = scanner.nextDouble();
        int sumAB = add(a, b);
        double sumAABB = add(aa, bb);
        System.out.println("sumAB = " + sumAB);
        System.out.println("sumAABB = " + sumAABB);
        System.out.println("请输入第三个数：");
        int c = scanner.nextInt();
        double cc = scanner.nextDouble();
        int sumABC = add(a, b, c);
        double sumAABBCC = add(aa, bb, cc);
        System.out.println("sumABC = " + sumABC);
        System.out.println("sumAABBCC = " + sumAABBCC);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static boolean isEquals(int a, int b) {
        return a == b;
    }

    public static boolean isEquals(double a, double b) {
        return a == b;
    }
}
