package FourteenDayChallenge.DayOne;

import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.println("Number of even digits is: " + sumOfEven(num));
    }

    static int sumOfEven(int a) {
        int count = 0;

        while (a > 0) {
            int rem = a % 10;
            if (rem % 2 == 0) {
                count++;
            }
            a = a / 10;
        } return count;
    }
}
