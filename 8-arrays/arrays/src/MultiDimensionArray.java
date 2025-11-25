import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1, 2, 3},      // 0th index
//                {4, 5},         // 1st index
//                {6, 7, 8, 9}    // 2nd index -> arr2D[2] = {6, 7, 8, 9}
//        };

        //INPUT
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //OUTPUT
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
