package FourteenDayChallenge.DayTwo;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.println("Reverse Number: " + reverseNumber(num));
    }

    static int reverseNumber (int a) {
        int reverse = 0;
        while (a > 0) {
            int rem = a % 10;
            a /= 10;
            reverse = (reverse * 10) + rem;
        } return reverse;
    }
}
