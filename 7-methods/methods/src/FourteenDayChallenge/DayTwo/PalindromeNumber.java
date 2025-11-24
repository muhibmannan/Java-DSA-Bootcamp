package FourteenDayChallenge.DayTwo;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = in.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Palindrome Number!");
        } else {
            System.out.println("Not a palindrome number");
        }
    }

    static boolean isPalindrome(int a) {
        int reverseNumber = 0;
        int originalNumber = a;
        while (originalNumber > 0) {
            int rem = originalNumber % 10;
            reverseNumber = (reverseNumber * 10) + rem;
            originalNumber /= 10;
        }
        return reverseNumber == a;
    }
}
