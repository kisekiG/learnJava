public class Test8_While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);

        int count = 0;
        int ii = 100;
        while (ii <= 999) {
            int a = ii % 10;
            int b = ii / 10 % 10;
            int c = ii / 100 % 10;
            if (ii == a * a * a + b * b * b + c * c * c) {
                count++;
            }
            ii++;
        }
        System.out.println("count = " + count);
    }
}
