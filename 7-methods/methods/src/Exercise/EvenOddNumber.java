package Exercise;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num = in.nextInt();

         if(isEven(num)) {
             System.out.println("Even");
         } else {
             System.out.println("Odd");
         }

    }

    private static boolean isEven(int a) {
        return a >= 0 && a % 2 == 0;
    }
}
