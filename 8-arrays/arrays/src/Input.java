import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

//        arr[0] = 54;
//        arr[1] = 1565;
//        arr[2] = 2;
//        arr[3] = 654;
//        arr[4] = 98887;
//
//        System.out.println(arr[3]);

        //Input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

        /* Print using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } */

        /* Print using ENHANCED for loop
        for (int num : arr) {   // here num represents element of the array
            System.out.print(num + " "); // for every element in the array, print the element
        } */

        // Print using toString
//        System.out.println(Arrays.toString(arr));

        // CREATING OBJECT ARRAY
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Muhib";
        System.out.println(Arrays.toString(str));
    }
}
