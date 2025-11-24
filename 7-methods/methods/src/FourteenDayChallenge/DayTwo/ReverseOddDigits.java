package FourteenDayChallenge.DayTwo;

import java.util.Scanner;

public class ReverseOddDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = in.nextInt();
        System.out.println("Reverse of Odd digits is: " + reverseOdd(number));
    }

    static int reverseOdd (int n) {
        int temp = n;
        int oddStorage = 0;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                oddStorage = (oddStorage * 10) + digit;
            }
            temp /= 10;
        }

        temp = n;
        int result = 0;
        int place = 1;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                int replacement = oddStorage % 10;
                result = result + (replacement * place);
                oddStorage /= 10;
            } else {
                result = result + (digit * place);
            }
            place *= 10;
            temp /= 10;
        }
        return result;
    }
}
