package Exercise;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = in.nextInt();

        System.out.println(palindrome(num));

    }

    static String palindrome (int a) {
        int originalNumber = a;
        int reverseNumber = 0;
        while (a > 0) {
            int rem = a % 10;
            a /= 10;
            reverseNumber = reverseNumber * 10 + rem;
        }

        if (reverseNumber == originalNumber) {
            return "Palindrome Number!";
        } else {
            return "Not a palindrome number.";
        }
    }
}
