public class Test9_ForFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            //System.out.println("i = " + i);
            for (int j = 1; j <= 5; j++) {
                // System.out.println("j = " + j);
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + '\t');
            }
            System.out.println();
        }

        outer:
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            inter:
            for (int j = 1; j <= 10; j++) {
                System.out.println("j = " + j);
                break outer;
            }
        }
    }
}
