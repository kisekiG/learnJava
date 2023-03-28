public class Test7_FlowerCount {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;

            if (i == a * a * a + b * b * b + c * c * c) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
