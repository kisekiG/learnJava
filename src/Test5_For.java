public class Test5_For {
    public static void main(String[] args) {
       /* for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }*/

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);

        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum);

        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum);

        sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);

        sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);

    }
}
