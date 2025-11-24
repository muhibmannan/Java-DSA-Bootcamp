package FourteenDayChallenge.DayOne;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.println("The sum of the digits is: " + sumOfDigits(num));
    }

    static int sumOfDigits (int a) {
        int sum = 0;

        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            sum += rem;
        } return sum;
    }
}
