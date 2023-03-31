import java.util.Scanner;

public class Test18_Math {
    public static void main(String[] args) {
        int randomNumber = forMath();
        guessRandom(randomNumber);

    }

    public static int forMath() {
        int randomNumber = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 100 + 1));
            randomNumber = (int) (Math.random() * 100 + 1);
        }
        return randomNumber;
    }

    public static void guessRandom(int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数，范围在1-100之间：");
        while (true) {
            int result = scanner.nextInt();
            if (result > randomNumber) {
                System.out.println("大了");
            } else if (result < randomNumber) {
                System.out.println("小了");
            } else {
                System.out.println("中了");
                break;
            }
        }
    }
}
