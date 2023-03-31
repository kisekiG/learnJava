/**
 * @author kisekig
 */
public class Test12_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55};
        /*for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }*/
        forArray(arr);
        reverseArray(arr);
        forArray(arr);
        getIndex(arr, 55);
    }

    /**
     * @param arr 数组参数
     *            循环数组
     * @author kisekiG
     */
    public static void forArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

    /**
     * @param arr 数组参数
     * @author kisekiG
     */
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }

    public static void getIndex(int[] arr, int value) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == value) {
                System.out.println("i = " + i);
            }
        }
    }


}
