public class Test13_ArrayArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        int[][] arr2 = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99},};
        forArray(arr);
        forArray(arr2);
    }

    public static void forArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("arr[" + i + "][" + j + "] =" + arr[i][j]);
                sum += arr[i][j];
            }
        }
        System.out.println("sum = " + sum);
    }
}
