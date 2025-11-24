package FourteenDayChallenge.DayTwo;

import java.util.Scanner;

public class DifferenceOriginalReversed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = in.nextInt();

        int reversedNumber = reversedNumber(number);
        System.out.println("Reversed Number is: " + reversedNumber);

        int difference = number - reversedNumber;
        System.out.println("Difference between original and reversed number is: " + difference);
    }

    static int reversedNumber (int a) {
        int result = 0;
        while (a > 0) {
            int rem = a % 10;
            a /= 10;
            result = (result * 10) + rem;
        } return result;
    }
}
