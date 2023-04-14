import java.util.Arrays;

public class Test26_Arrays {
    public static void main(String[] args) {
        int[] arr = {33, 22, 11, 44, 66, 55};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 33));
    }
}
