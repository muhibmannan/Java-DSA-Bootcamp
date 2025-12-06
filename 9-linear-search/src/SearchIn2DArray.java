import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21, 5, 56},
                {35, 67, 2, 45, 54},
                {12, 26, 75, 24},
                {36, 65, 91}
        };
        int target = 65;
        System.out.println(searchBoolean(arr, target));

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println("Max value: " + max(arr));
    }

    static boolean searchBoolean(int[][] arr, int tar) {
        if (arr.length == 0) {
            return false;
        }

        for (int[] row : arr) {
            for (int col : row) {
                if (col == tar) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] search (int[][] arr, int tar) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == tar) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max (int[][] arr) {
        int max = arr[0][0];    //  or, int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
