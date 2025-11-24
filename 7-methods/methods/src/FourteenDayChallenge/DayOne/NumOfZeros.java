package FourteenDayChallenge.DayOne;

import java.util.Scanner;

public class NumOfZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.println("Number of Zero is: " + numOfZero(num));
    }

    static int numOfZero (int a) {
        int count = 0;

        while (a > 0) {
            int rem = a % 10;
            if (rem == 0) {
                count++;
            }
            a = a / 10;
        } return count;
    }
}
