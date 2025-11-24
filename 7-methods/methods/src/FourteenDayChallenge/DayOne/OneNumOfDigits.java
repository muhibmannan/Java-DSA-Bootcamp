package FourteenDayChallenge.DayOne;

import java.util.Scanner;

public class OneNumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.println("The number of digits is: " + numOfDigits(num));
    }

    static int numOfDigits(int a) {
        int newNum = a;
        int count = 0;
        while ( newNum > 0) {
            count++;
            newNum = newNum / 10;
        } return count;
    }
}
