import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String[] arr = new String[3];
//
//        for (int row = 0; row < arr.length; row++) {
//            arr[row] = in.next();
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        int size = arr.length;
//        System.out.println(size);

        String[][] arr = new String[3][];

        arr[0] = new String[3];
        arr[1] = new String[2];
        arr[2] = new String[4];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.next();
            }
        }

        for(String[] row : arr) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
