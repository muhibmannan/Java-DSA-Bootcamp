import java.util.Arrays;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr = {12, 43, 67, 8, -11, 20};

        System.out.println(min(arr));
    }

    static int min (int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        } return min;
    }
}
